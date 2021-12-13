// 11720 숫자의합 브론즈2

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
  const num = parseInt(input[0]);
  let sum = 0;
  for (let i = 1; i <= num; i++) {
    sum += i;
  }
  console.log(sum);
});
