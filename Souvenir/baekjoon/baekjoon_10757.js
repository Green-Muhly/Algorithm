// 10757 큰 수 A+B(브론즈 5)

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
  let input_Arr = input[0].split(" ").map(BigInt);
  console.log((input_Arr[0] + input_Arr[1]).toString());
});
