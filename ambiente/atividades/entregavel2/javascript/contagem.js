var valores = [];

function contagem() {
  valores = document.getElementById("contagem").value.split(",");
  var contador = 0
  var contador2 = 0
  for(var i = 0 ; i in valores ; i++){
    console.log(valores[i])
    if((Math.floor(valores[i]) === 'valores[i]' && Math.ceil(valores[i]) === 'valores[i]') === true){
        contador++
    } else if((Math.floor(valores[i]) === 'valores[i]' && Math.ceil(valores[i]) === 'valores[i]') === false){
        contador2++
    }
  }

  alert("A quantidade de numeros inteiros é igual a " + contador2)
}