/*
  직사각형에서 탈출(브론즈3)
  
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
  const [x, y, w, h] = input[0].split(" ").map(Number);
  let result = [x, y, w - x, h - y];

  console.log(Math.min(...result));
});
