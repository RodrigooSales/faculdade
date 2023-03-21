// Ordenação: Ordenar um array usando o método Quicksort

function quickSort(array, inicio, fim) {
    if (inicio < fim) {
        let posicaoPivo = particao(array, inicio, fim);
        quickSort(array, inicio, posicaoPivo - 1);
        quickSort(array, posicaoPivo + 1, fim);
    }
}

function particao(array, inicio, fim) {
    let pivo = array[inicio];
    let i = inicio + 1;
    let j = fim;
    while (i <= j) {
        if (array[i] <= pivo) {
            i++;
        } else if (array[j] > pivo) {
            j--;
        } else if (i <= j) {
            let temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
    array[inicio] = array[j];
    array[j] = pivo;
    return j;
}

function gerarNumerosAleatorios(quantidade) {
    let numeros = [];
    for (let i = 0; i < quantidade; i++) {
        numeros.push(Math.floor(Math.random() * 10));
    }
    return numeros;
}

let numeros = gerarNumerosAleatorios(10);
console.log("Array não ordenado: " + numeros);
quickSort(numeros, 0, numeros.length - 1);
console.log("Array ordenado: " + numeros);
