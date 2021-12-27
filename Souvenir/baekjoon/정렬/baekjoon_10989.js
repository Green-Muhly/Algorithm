// 수 정렬하기3 (실버5)

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
  let result = "";
  const max = Math.max(...input);
  let arr = new Array(max + 1).fill(0);

  for (let i = 0; i < input.length; i++) {
    arr[input[i]]++;
  }
  for (let i = 0; i < arr.length; i++) {
    if (arr[i]) {
      for (let j = 0; j < arr[i]; j++) {
        result += `${i}\n`;
      }
    }
  }
});
