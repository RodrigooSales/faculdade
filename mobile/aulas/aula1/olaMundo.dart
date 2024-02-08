//import 'dart:io';

main() {
  //para executar um programa em dart simplesmente digite dart run <arquivo.dart>

  var nomes = ["Ana", "Pedro", "Alberto"];
  nomes.add("Miguel");
  print(nomes);
  print(nomes.length);
  print(nomes.elementAt(2));
  print(nomes[2]);
  nomes.removeAt(0);
  print(nomes);
  nomes.sort();
  print(nomes);

  /*
  print("Qual o seu nome?");
  String? entrada = stdin.readLineSync();
  print("seu nome é $entrada");


  int numeroInteiro = 10;
  double numeroPontoFlutuante = 5.3;
  bool estaChovendo = false;
  String nome = "Bel";

  print(numeroInteiro);

  num numeroQualquer = 15;
  numeroQualquer = 9.7;

  var idade = "Trinta";
  print(idade);

  dynamic coringa;
  coringa = 10;
  print(coringa);
  coringa = "String qualquer";
  print(coringa);

  int sala = 8;
  print("A sala de aula é a $sala");
  print("A sala de aula é a ${sala + 1}");
  print("A sala de aula é a " + sala.toString());
  */
}
