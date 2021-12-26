// 수 정렬하기2 (실버5)

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
  if (input.length === parseInt(input[0]) + 1) rl.close();
}).on("close", function () {
  input.shift();
  let result = "";
  input.sort((a, b) => a - b).forEach((value) => (result += `${value}\n`));

  console.log(result);
});
