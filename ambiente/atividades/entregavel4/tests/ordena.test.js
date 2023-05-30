// generate tests for the contagem function
// using the jest framework

const quickSort = require("../js/ordena");;

test('ordena os numeros de forma crescente', () => {
    expect(quickSort([9, 2, 5, 4, 3, 6, 7, 8, 1, 10])).toBe([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]);
});