// generate tests for the contagem function
// using the jest framework

const calculaPrimo = require('../js/primo');

test('Verifica se o número é primo', () => {
    expect(calculaPrimo(2)).toBe(true);
});

test('Verifica se o número é primo', () => {
    expect(calculaPrimo(4)).toBe(false);
});