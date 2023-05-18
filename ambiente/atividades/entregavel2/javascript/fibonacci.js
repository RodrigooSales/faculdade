// Fibonacci: onde N > 1. Os primeiros termos são: 0, 1, 1, 2, 3, 5, 8, 13 …. Cada termo, além dos dois primeiros,
// é derivado da soma de seus dois antecessores mais próximos.

function calcularFibonacci() {
    let a = 1, b = 1,n=parseInt(document.getElementById("fibonacci").value) ;
    let sequence = a + " " + b;
    for(let i=2;i<n;i++){
    let c = a + b;
    sequence += " " + c;
    a = b;
    b = c;
    }
    alert(sequence);
}