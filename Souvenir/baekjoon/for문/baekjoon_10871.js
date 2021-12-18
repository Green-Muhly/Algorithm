// X보다 작은 수

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
  if (time === 2) rl.close();
}).on("close", function () {
  const [num, maxNum] = input[0].split(" ").map(Number);
  const secondArr = input[1].split(" ").map(Number);

  let result = [];
  secondArr.map((x) => {
    if (x < maxNum) {
      result.push(x);
    }
  });
  console.log(result.join(" "));
});
