// Fibonacci: onde N > 1. Os primeiros termos são: 0, 1, 1, 2, 3, 5, 8, 13 …. Cada termo, além dos dois primeiros,
// é derivado da soma de seus dois antecessores mais próximos.

function fibonacci(n) {
    let a = 0, b = 1;
    console.log(a + " " + b);
    for(let i=2;i<n;i++){
        let c = a + b;
        console.log(c);
        a = b;
        b = c;
    }
}

fibonacci(10); // altere o valor de n para obter uma sequência de tamanho diferente
