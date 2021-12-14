// 2741 N찍기 브론즈3

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
  let sum = "";
  for (let i = 1; i <= num; i++) {
    sum += `${i}\n`;
  }
  console.log(sum);
});
