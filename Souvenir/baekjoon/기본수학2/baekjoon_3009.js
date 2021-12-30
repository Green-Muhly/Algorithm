/*
  네번째 점(브론즈3)
  
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
  if (time === 3) rl.close();
}).on("close", function () {
  const [ax, ay] = input[0].split(" ").map(Number);
  const [bx, by] = input[1].split(" ").map(Number);
  const [cx, cy] = input[2].split(" ").map(Number);

  let [x, y] = [0, 0];

  if (ax === bx) {
    x = cx;
  } else if (ax === cx) {
    x = bx;
  } else {
    x = ax;
  }

  if (ay === by) {
    y = cy;
  } else if (ay === cy) {
    y = by;
  } else {
    y = ay;
  }
  console.log(x, y);
});
