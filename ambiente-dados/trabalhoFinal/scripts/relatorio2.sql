SELECT
    pt.Nome AS NomePontoTuristico,
    pt.Tipo,
    pt.Suporte_Necessidades_Epeciais,
    c.Nome AS NomeCidade
FROM
    mydb.Pontos_Turisticos pt
JOIN mydb.Cidade c ON pt.Cidade_idCidade = c.idCidade
WHERE
    pt.Suporte_Necessidades_Epeciais = 'Não';
