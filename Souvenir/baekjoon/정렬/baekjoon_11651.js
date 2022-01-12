// 좌표 정렬하기2 (실버5)

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
  const arr = input.map((x) => x.split(" ").map(Number));

  const sorted = arr.sort(([x1, y1], [x2, y2]) => {
    if (y1 === y2) return x1 - x2;
    else return y1 - y2;
  });

  let result = "";
  sorted.forEach(([x, y]) => {
    result += `${x} ${y}\n`;
  });
  console.log(result);
});
