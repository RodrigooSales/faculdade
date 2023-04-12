//Utilizar métodos integrados aos arrays JS: push / pop, shift / unshift, indexOf e slice
function printarArray(array, j) {
    console.log("----------------------------------------------------------------------------------------------------------")
    console.log("Printando array\n")
    for(var i = 0; i < j ; i++){
        console.log("- " + array[i]);
    }
}

var pecas = ["parafusos", "martelos", "chaves de fenda", "furadeira"]


pecas.push("chave phillips")

printarArray(pecas, pecas.length)

pecas.pop()

printarArray(pecas, pecas.length)

pecas.unshift("porca")

printarArray(pecas, pecas.length)

pecas.shift("porca")

printarArray(pecas, pecas.length)

console.log("--------------------------------------------------------------------------------------------------------------------")

console.log(pecas.indexOf("martelos"))

console.log("--------------------------------------------------------------------------------------------------------------------")

var slice = pecas.slice(0, 3)

console.log(slice)