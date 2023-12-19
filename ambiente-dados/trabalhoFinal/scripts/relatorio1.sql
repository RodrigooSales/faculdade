SELECT
    a.Dia,
    a.Hora_Inicio,
    a.Hora_FIm,
    a.Programacao,
    v.Nome AS NomeViagem,
    c.Nome AS NomeCidade
FROM
    mydb.Agenda a
JOIN mydb.Viagem v ON a.Viagem_idViagem = v.idViagem
JOIN mydb.Cidade c ON a.Viagem_Cidade_idCidade = c.idCidade
ORDER BY
    a.Dia,
    a.Hora_Inicio;
