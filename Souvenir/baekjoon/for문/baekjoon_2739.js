/*
  구구단(브론즈3)
*/

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
  let num = parseInt(input[0]);

  for (let i = 1; i <= 9; i++) {
    console.log(`${num} * ${i} = ${num * i}`);
  }
});
