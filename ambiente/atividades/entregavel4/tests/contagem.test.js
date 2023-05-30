const contagem = require('../js/contagem');

test('a quantidade de numeros inteiros entre 1 e 10', () => {
    expect(contagem([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])).toBe(10);
});

test('a quantidade de numeros inteiros entre 1 e 10', () => {
    expect(contagem([1, 2, 3, 4, 5.2, 6, 7.12, 8, 9.4, 10])).toBe(7);
});