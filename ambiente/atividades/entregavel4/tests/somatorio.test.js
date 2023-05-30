// generate tests for the contagem function
// using the jest framework

const calculaSomatorio = require('../js/somatorio');

test('Verifica se o somatorio é correto', () => {
    expect(calculaSomatorio([1,2,3,4,5])).toBe(15);
});

test('Verifica se o somatorio é correto', () => {
    expect(calculaSomatorio([-1,2,3,4,5,6,7,8,9,10])).toBe(53);
});