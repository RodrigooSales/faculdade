function geraVetor(quantidade) {
  let vetor = [];
  for (let i = 0; i < quantidade; i++) {
    vetor[i] = Math.floor(Math.random() * 101);
  }
  return vetor;
}

function quicksort(vetor) {
  if (vetor.length <= 1) {
    return vetor;
  }

  let pivo = vetor[0];
  let esquerda = [];
  let direita = [];

  for (let i = 1; i < vetor.length; i++) {
    if (vetor[i] < pivo) {
      esquerda.push(vetor[i]);
    } else {
      direita.push(vetor[i]);
    }
  }

  return quicksort(esquerda).concat(pivo, quicksort(direita));
}

function ordena() {
  let quantidade = parseInt(document.getElementById("quicksort").value);
  let vetor = geraVetor(quantidade);
  let vetorOrdenado = quicksort(vetor);

  alert("Vetor desordenado: " + vetor + "\nVetor ordenado: " + vetorOrdenado);
}
