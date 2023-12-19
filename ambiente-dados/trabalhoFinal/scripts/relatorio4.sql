SELECT
    v.idViagem,
    v.Nome AS NomeViagem,
    c.Nome AS NomeCidade,
    COUNT(vp.Pessoas_idPessoas) AS NumeroPessoas,
    SUM(d.Preco) AS CustoViagem
FROM
    mydb.Viagem v
JOIN mydb.Cidade c ON v.Cidade_idCidade = c.idCidade
JOIN mydb.Despesas d ON v.idViagem = d.Viagem_idViagem
JOIN mydb.Viagem_Pessoas vp ON v.idViagem = vp.Viagem_idViagem
GROUP BY
    v.idViagem,
    v.Nome,
    c.Nome;
