import 'package:flutter/material.dart';

main() {
  runApp(new MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context){
    return MaterialApp(
      home: PrimeiraAplicacao(),
    );
  }
}

class PrimeiraAplicacao extends StatefulWidget{
  @override
  PrimeiraAplicacaoState createState(){
    return PrimeiraAplicacaoState();
  }
}


class PrimeiraAplicacaoState extends State<PrimeiraAplicacao> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        primarySwatch: Colors.blue,
        scaffoldBackgroundColor: Colors.white,
      ),
      home: Scaffold(
        appBar: AppBar(backgroundColor: Colors.blue),
        body: Center(
            child: Padding(
          padding: EdgeInsets.all(16.0),
          child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                TextField(
                  onChanged: (text){
                  },
                  decoration: InputDecoration(labelText: 'Usuário'),
                ),
                TextField(
                  onChanged: (text){
                  },
                  obscureText: true,
                  decoration: InputDecoration(labelText: 'Senha'),
                ),
                Padding(
                  padding: const EdgeInsets.all(25.0),
                  child: ElevatedButton(
                    onPressed: null,
                    child: Text('Login')
                  )
                )
              ],
            )
          )
        )
      ));
  }
}
