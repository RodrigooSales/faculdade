// Somatório: Soma de um conjunto de números.

function calculaSomatorio(numeros){
let soma = 0;
for(let i=0;i<numeros.length;i++){
    soma += numeros[i];
}
console.log("Somatório: " + soma);
}

module.exports = calculaSomatorio;