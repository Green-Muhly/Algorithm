// 10870 피보나치수 5 (브론즈2)

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
  function fibonaci(L) {
    if (L === 0) {
      return 0;
    } else if (L === 1) {
      return 1;
    } else {
      return fibonaci(L - 1) + fibonaci(L - 2);
    }
  }
  console.log(fibonaci(num));
});
