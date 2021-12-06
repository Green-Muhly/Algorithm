// 2839 설탕배달(브론즈 1)

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
let time = 0;
const reducer = (acc, cur) => acc + cur;

rl.on("line", function (line) {
  input.push(line);
  time++;
  if (time === 1) rl.close();
}).on("close", function () {
  let num = parseInt(input[0]);
  let count = 0;
  while (true) {
    if (num % 5 === 0) {
      console.log(num / 5 + count);
      break;
    }
    if (num < 0) {
      console.log(-1);
      break;
    }
    num -= 3;
    count++;
  }
});
