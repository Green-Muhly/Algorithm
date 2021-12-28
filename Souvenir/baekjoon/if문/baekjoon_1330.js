/*
  두 수 비교하기(브론즈4)
  
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
  const [num1, num2] = input[0].split(" ").map(Number);

  if (num1 > num2) console.log(">");
  else if (num1 < num2) console.log("<");
  else console.log("==");
});
