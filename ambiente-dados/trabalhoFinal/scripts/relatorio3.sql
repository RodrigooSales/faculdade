SELECT
    v.Nome AS NomeViagem,
    d.Tipo_Despesa,
    COUNT(vp.Pessoas_idPessoas) AS QuantidadePessoas,
    SUM(d.Preco) AS TotalGasto,
    SUM(d.Preco) / COUNT(vp.Pessoas_idPessoas) AS CustoPorPessoa
FROM
    mydb.Viagem v
JOIN mydb.Despesas d ON v.idViagem = d.Viagem_idViagem
JOIN mydb.Viagem_Pessoas vp ON v.idViagem = vp.Viagem_idViagem
GROUP BY
    v.idViagem,
    d.Tipo_Despesa,
    v.Nome;
