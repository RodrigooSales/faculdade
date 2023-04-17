// Número é primo: Um número inteiro positivo n é primo se for divisível apenas por 1 e por n.

function verificarPrimo() {
    let numero = parseInt(document.getElementById("primo").value);
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
        alert(numero + " é um número primo.");
    } else {
        alert(numero + " não é um número primo.");
    }
}

