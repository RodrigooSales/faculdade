// Máximo divisor comum: O máximo divisor comum (mdc) de dois inteiros a, b é o maior número inteiro que divide a e b.

function calcularMdc() {
    let a = parseInt(document.getElementById("numero1").value);
    let b = parseInt(document.getElementById("numero2").value);

    if(isNaN(a) || isNaN(b)) {
        alert("Digite valores válidos para os números.");
        return;
    }

    let mdc = calcularMdcRecursivo(a, b);

    alert("MDC(" + a + ", " + b + ") = " + mdc);
}

function calcularMdcRecursivo(a, b) {
    if (b === 0) {
        return a;
    } else {
        return calcularMdcRecursivo(b, a % b);
    }
}

