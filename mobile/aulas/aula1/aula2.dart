class Produto{
  String _nome;
  double _preco = 0;

  Produto(this._nome, this._preco);

  String getNome(){
    return _nome;
  }

  String get nomePublico => this._nome;
  set nome(String nome) => this._nome = nome;

  double get getPreco => this._preco;
  set setPreco(double preco) => this._preco = preco; 
}

void main(){  
  Produto lapis = new Produto("Lápis", 1.30);
  print(lapis.nomePublico);
  lapis.nome = "Caneta";
  print(lapis.nomePublico);

  print(lapis.getPreco);

  lapis.setPreco = 1.50;
  print(lapis.getPreco);
}

