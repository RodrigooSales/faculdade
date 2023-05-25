// Número é primo: Um número inteiro positivo n é primo se for divisível apenas por 1 e por n.
function calculaPrimo(){
const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite um número inteiro positivo: ", function (numero) {
    numero = parseInt(numero);
    let ehPrimo = true;
    if (numero <= 1) {
        ehPrimo = false;
    } else {
        for (let i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i === 0) {
                ehPrimo = false;
                break;
            }
        }
    }
    if (ehPrimo) {
        console.log(numero + " é um número primo.");
    } else {
        console.log(numero + " não é um número primo.");
    }
    rl.close();
});
}
module.exports = calculaPrimo;