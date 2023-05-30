const fibonnaic = require('../js/fibonacci');

test('os 10 primeiros números da sequência de Fibonacci', () => {
    expect(fibonnaic(10)).toMatchObject([0, 1, 1, 2, 3, 5, 8, 13, 21, 34]);
});

test('os 20 primeiros números da sequência de Fibonacci', () => {
    expect(fibonnaic(2)).toMatchObject([0, 1]);
});