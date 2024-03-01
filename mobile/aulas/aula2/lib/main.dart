import 'package:flutter/material.dart';

void main() {
  runApp(new PrimeiraAplicacao());
}

class PrimeiraAplicacaoState extends State<PrimeiraAplicacao> {
  var perguntaAtual = 0;
  final perguntas = [
    "Qual a sua cor favorita?",
    "Qual a função de um botão?",
    "O que você almoçou?",
    "Qual a décima casa decimal de PI?",
    "Em que ano nasceu Getúlio Vargas?",
  ];

  void mudaPergunta() {
    setState(() {
      perguntaAtual++;
    });
    print(perguntas[perguntaAtual]);
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Primeira Aplicação'),
        ),
        body: Column(
          children: [
            Text(perguntas[perguntaAtual]),
            ElevatedButton(
              onPressed: mudaPergunta,
              child: Text("Resposta 1 - Elevado"),
            ),
            TextButton(
              onPressed: mudaPergunta,
              child: Text("Resposta 2 - Texto"),
            ),
            OutlinedButton(
                onPressed: mudaPergunta, child: Text("Resposta 3 - outlined")),
          ],
        ),
      ),
    );
  }
}

class PrimeiraAplicacao extends StatefulWidget {
  @override
  PrimeiraAplicacaoState createState() {
    return PrimeiraAplicacaoState();
  }
}
