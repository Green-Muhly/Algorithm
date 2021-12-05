/*
  소인수분해(실버 5)
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

  while (true) {
    for (let i = 2; i <= num; i++) {
      if (num % i === 0) {
        console.log(i);
        num = num / i;

        break;
      }
    }
    if (num === 1) break;
  }
});
