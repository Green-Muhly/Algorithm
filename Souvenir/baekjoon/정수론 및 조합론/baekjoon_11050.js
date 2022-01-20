// 이항계스

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
let time = 0;

function factorial(n) {
  let answer = 1;
  for (let i = 2; i <= n; i++) {
    answer *= i;
  }
  return answer;
}

rl.on("line", function (line) {
  input.push(line);
  time++;
  if (time === 1) rl.close();
}).on("close", function () {
  let [num1, num2] = input[0].split(" ").map(Number);
  console.log(factorial(num1) / (factorial(num2) * factorial(num1 - num2)));
});
