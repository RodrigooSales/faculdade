// generate tests for the mdc function
// using the jest framework

const calcularMdc = require("../js/mdc");

test("mdc de 10 e 5 é 5", () => {
  expect(calcularMdc(10, 5)).toBe(5);
});

test("mdc de 2 e 3 é 1", () => {
  expect(calcularMdc(2, 3)).toBe(1);
});
