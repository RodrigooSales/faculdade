// const express = require('express')
// const multer = require('multer')
// const csv = require('csv-parser')
// const path = require('path')
// const fs = require('fs')

// const app = express();
// const port = 3000;
// const upload = multer({dest : './uploads'})

// app.get('/', (req, res) => {
//   res.sendfile(path.join(__dirname, 'index.html'));
// });

// app.post('/upload', upload.single('csvFile'), (req, res) => {
//   const file = req.file
//   if(!file){
//     res.status(400).send('nenhum arquivo foi anexado')
//     return
//   }

//   const results = []

//   fs.createReadStream(file.path)
//     .pipe(csv())
//     .on('data', (data) => results.push(data))
//     .on('end', () => {
//       console.log(results)
//     })
  
// });

// app.listen(port, () => {
//   console.log(`App listening at http://localhost:${port}`);
// });

var amqp = require('amqplib/callback_api');

amqp.connect('amqps://drydhblv:nI2ZVgy8acFxj73dR7s8tGFa4zJnENZ7@prawn.rmq.cloudamqp.com/drydhblv', function(error0, connection) {
  if (error0) {
    throw error0;
  }
  connection.createChannel(function(error1, channel) {
    if (error1) {
      throw error1;
    }
    var exchange = 'a';

    channel.assertExchange(exchange, 'fanout', {
      durable: false
    });

    channel.assertQueue('', {
      exclusive: true
    }, function(error2, q) {
      if (error2) {
        throw error2;
      }
      console.log(" [*] Waiting for messages in %s. To exit press CTRL+C", q.queue);
      channel.bindQueue(q.queue, exchange, '');

      channel.consume(q.queue, function(msg) {
      	if(msg.content) {
	        console.log(" [x] %s", msg.content.toString());
	      }
      }, {
        noAck: true
      });
    });
  });
});