// A+B-4 브론즈3

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
let time = 0;

rl.on("line", function (line) {
  if (!line) rl.close();
  input.push(line);
}).on("close", function () {
  // input.pop()
  input.map((arr) => {
    const [num1, num2] = arr.split(" ").map(Number);
    console.log(num1 + num2);
  });
});
