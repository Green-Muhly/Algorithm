// 스택 수열 (실버3)

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
  const n = parseInt(input.shift());

  const arr = input.map(Number);
  const stack = [];
  let result = "";
  let count = 1;

  for (let i = 0; i < n; i++) {
    const number = arr.shift();

    while (count <= number) {
      stack.push(count++);
      result += "+\n";
    }

    const popItem = stack.pop();
    if (popItem !== number) {
      result = "NO";
      break;
    }
    result += "-\n";
  }

  console.log(result);
});
