// Somatório: Soma de um conjunto de números.

let numeros = [1, 2, 3, 4, 5]; // altere os valores do array para calcular o somatório de outros números
let soma = 0;
for(let i=0;i<numeros.length;i++){
    soma += numeros[i];
}
console.log("Somatório: " + soma);
