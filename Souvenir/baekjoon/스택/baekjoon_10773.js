// 제로 (실버4)

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
  const stack = [];
  input.map(Number).map((item) => {
    if (item === 0) stack.pop();
    else {
      stack.push(item);
    }
  });
  const result = stack.reduce((acc, cur) => acc + cur, 0);
  console.log(result);
});
