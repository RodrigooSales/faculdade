// Máximo divisor comum: O máximo divisor comum (mdc) de dois inteiros a, b é o maior número inteiro que divide a e b.
function calcularMdc(num1, num2) {
  let resto;
  do {
    resto = num1 % num2;
    num1 = num2;
    num2 = resto;
  } while (resto != 0);
  let resultado = num1;
  console.log(resultado);
}
module.exports = calcularMdc;
