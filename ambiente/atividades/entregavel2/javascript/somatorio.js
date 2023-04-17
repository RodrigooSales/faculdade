// Somatório: Soma de um conjunto de números.

function somatorio() {
    let numeros = document.getElementById("soma-input").value.split(",");
    let soma = 0;
    for (let i = 0; i < numeros.length; i++) {
      soma += parseInt(numeros[i]);
    }
    alert("Somatório: " + soma);
  }
  
