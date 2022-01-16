// 나이순 정렬 (실버5)

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

  input.sort((a, b) => a.split(" ")[0] - b.split(" ")[0]);

  console.log(input.join("\n"));
});
