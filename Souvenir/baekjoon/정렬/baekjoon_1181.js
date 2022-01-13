// 단어 정렬 (실버5)

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

  const sorted = [...new Set(input)].sort((a, b) => {
    return a.length - b.length || a.localeCompare(b);
  });

  let result = "";
  sorted.forEach((a) => {
    result += `${a}\n`;
  });
  console.log(result);
});
