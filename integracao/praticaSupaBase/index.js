const express = require('express') 
const multer = require('multer')
const csv = require('csv-parser')
const path = require('path')
const fs = require('fs') //file system 
const db = require('@supabase/supabase-js')

const supabase = db.createClient('https://lexokfpfjjunvgqmqghp.supabase.co','eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImxleG9rZnBmamp1bnZncW1xZ2hwIiwicm9sZSI6ImFub24iLCJpYXQiOjE2ODQxOTA2MTksImV4cCI6MTk5OTc2NjYxOX0.ut07UzBcD_-bRmysh7v37Fwa0qDHYHdzogccGYiMNuU')

const app = express() 
const porta = 3000
const upload = multer({dest: 'uploads/'}) //multer -> para manipulação em upload de arquivo 

app.get('/', (req, res) =>{
  res.sendFile(path.join(__dirname, '/index.html')) 
  //junta o nome do caminho e chama o arquivo
  //res.sendFile(path.join(__dirname + '/uploads', 'teste.txt'))
})

app.post('/upload', upload.single('csvfile'), async (req, res) => {
  const file = req.file;
  if (!file) {
    res.status(400).send('Nenhum arquivo enviado');
    return;
  }

  const results = [];

  try {
    await new Promise((resolve, reject) => {
      fs.createReadStream(file.path)
        .pipe(csv())
        .on('data', (data) => results.push(data))
        .on('end', () => resolve())
        .on('error', (error) => reject(error));
    });

    // adicionando os dados ao Supabase
    const { data, error } = await supabase
      .from('tabela_csv_integracao_av2')
      .insert(results);

    if (error) {
      console.error(error);
      res.status(500).send('Erro ao inserir dados no Supabase');
      return;
    }

    console.log('Dados inseridos com sucesso:', data);
    res.status(200).send('Dados inseridos com sucesso no Supabase');
  } catch (err) {
    console.error('Erro:', err.message);
    res.status(500).send('Erro interno do servidor');
  }
});

app.listen(porta, () => {
  console.log('executando')
})
