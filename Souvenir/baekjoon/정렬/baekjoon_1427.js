// 소트인사이드(실버5)

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
  console.log(
    input[0]
      .split("")
      .map(Number)
      .sort((a, b) => b - a)
      .join("")
  );
});
