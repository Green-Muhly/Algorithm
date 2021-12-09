// 10872 팩토리얼 브론즈3

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
let time = 0;

rl.on("line", function (line) {
  input.push(line);
  time++;
  if (time === 1) rl.close();
}).on("close", function () {
  const num = parseInt(input);
  function factorial(L) {
    if (L === 1 || L === 0) {
      return 1;
    } else {
      return L * factorial(L - 1);
    }
  }
  console.log(factorial(num));
});
