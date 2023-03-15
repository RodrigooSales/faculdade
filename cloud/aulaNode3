    const express = require("express");
    const app = express();

    app.get("/consulta/", function(req, res){
        var cpf = req.query["cpf"];
        
        if(cpf){
            res.send("retorno consulta: cpf = " + cpf);
        } else{
            res.send("ERROR - CPF NÃO FORNECIDO")
        }
    })


    app.listen(3000, function(erro){
        if(erro){
            console.log("ERRO ao iniciar")
        } else{
            console.log("Servidor iniciado")
        }
    });
