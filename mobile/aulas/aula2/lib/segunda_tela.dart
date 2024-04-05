import 'package:flutter/material.dart';

main() {
  runApp(new HomeScreen());
}

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Pagina Inicial'),
      ),
      body: Column(children: [Text("Hello, second frame")]),
    );
  }
}
