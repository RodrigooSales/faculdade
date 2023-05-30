// Contagem: Dado um valor N números de entrada em um conjunto de dados, conte quantos valores inteiros existem, neste conjunto de dados,
// entre o primeiro dado (inclusive) e N (inclusive).

function contagem(numeros) {
  let count = 0;
  for (var i = 0; i < numeros.length; i++) {
    if (Number.isInteger(numeros[i])) {
      count++;
    }
  }

  return count
}
module.exports = contagem;
