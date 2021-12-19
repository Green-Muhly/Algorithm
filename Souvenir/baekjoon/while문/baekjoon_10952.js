// A+B-5 브론즈3

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
  if (input[time - 1] === "0 0") rl.close();
}).on("close", function () {
  input.pop();
  let numArr = input;
  numArr.map((num) => {
    let arr = num.split(" ").map(Number);
    console.log(arr[0] + arr[1]);
  });
});
