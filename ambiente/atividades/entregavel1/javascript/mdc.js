// Máximo divisor comum: O máximo divisor comum (mdc) de dois inteiros a, b é o maior número inteiro que divide a e b.

function calcularMdc(a, b) {
    if(b === 0){
        return a;
    } else {
        return calcularMdc(b, a % b);
    }
}

let a = 15, b = 10; // altere os valores de a e b para calcular o MDC de outros números
let mdc = calcularMdc(a, b);
console.log("MDC(" + a + ", " + b + ") = " + mdc);
