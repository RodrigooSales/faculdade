let valores = [];

function contagem() {
  let inputValores = parseInt(document.getElementById("contagem").value);
  valores = inputValores.split(",");
  let contador = 0
  let contador2 = 0
  console.log(valores)
  for(let i=0 ; i<valores.lenght ; i++){
    if(Number.isInteger(valores[i]) == true){
        contador++
    } else{
        contador2++
    }
  }

  alert("A quantidade de numeros inteiros é igual a " + contador)
}