from flask import Flask, jsonify

app = Flask(__name__)

usuarios = [
  {'id': '0e317fa1-c15d-4d3b-a6d2-db7a37f6933c', 'nome': 'Gabriel Primo'},
  {'id': '5f2fc69f-490f-4c87-8479-77f5d92c4d89', 'nome': 'Samuel Araujo'},
]

@app.route('/usuarios', methods=['GET'])
def get_usuarios():
  return jsonify(usuarios)

@app.route('/usuarios/<id>', methods=['GET'])
def get_usuario(id):
  for usuario in usuarios:
    if usuario['id'] == id:
      return jsonify(usuario)
  return jsonify({'error': 'Usuário não encontrado'}), 404

if __name__ == '__main__':
  app.run(debug=True, port=3000)