const express = require('express')
const multer = require('multer')
const csv = require('csv-parser')
const path = require('path')
const fs = require('fs')

const app = express();
const port = 3000;
const upload = multer({dest : './uploads'})

app.get('/', (req, res) => {
  res.sendfile(path.join(__dirname, 'index.html'));
});

app.post('/upload', upload.single('csvFile'), (req, res) => {
  const file = req.file
  if(!file){
    res.status(400).send('nenhum arquivo foi anexado')
    return
  }

  const results = []

  fs.createReadStream(file.path)
    .pipe(csv())
    .on('data', (data) => results.push(data))
    .on('end', () => {
      console.log(results)
    })
  
});

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}`);
});

