// Contagem: Dado um valor N números de entrada em um conjunto de dados, conte quantos valores inteiros existem, neste conjunto de dados, 
// entre o primeiro dado (inclusive) e N (inclusive).

let n = 10; // altere o valor de n para contar quantos valores inteiros existem entre 1 e n
let numeros = [2, 4, 6, 7, 9, 11, 13, 14, 15, 18]; // altere os valores do array para contar quantos valores inteiros existem entre o primeiro dado e n
let count = 0;
for(let i=0;i<numeros.length;i++){
    if(numeros[i] >= 1 && numeros[i] <= n){
        count++;
    }
}
console.log("Quantidade de valores inteiros: " + count);
