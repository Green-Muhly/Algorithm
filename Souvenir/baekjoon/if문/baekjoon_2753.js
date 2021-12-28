/*
  윤년(브론즈4)
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
  const num = parseInt(input[0]);

  if ((num % 4 === 0 && num % 100 !== 0) || num % 400 === 0) {
    console.log(1);
  } else console.log(0);
});
