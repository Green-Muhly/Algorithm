/*
  분해합(브론즈2)
  
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
  let result = 0;
  for (let i = 0; i < num; i++) {
    let number = i;
    let sum = 0;

    while (number != 0) {
      sum += number % 10;
      number = parseInt(number / 10);
    }
    if (sum + i === num) {
      result = i;
      break;
    }
  }
  console.log(result);
});
