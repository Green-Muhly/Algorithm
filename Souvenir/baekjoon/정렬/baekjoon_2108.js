// 통계학 (실버4)

function mostValue(arr) {
  const map = new Map();
  for (let i = 0; i < arr.length; i++) {
    if (!map.has(arr[i])) map.set(arr[i], 1);
    else map.set(arr[i], map.get(arr[i]) + 1);
  }

  let maxValue = 0;
  let answer = [];
  map.forEach((ele, key) => {
    if (maxValue < ele) {
      maxValue = ele;
      answer = [];
      answer.push(key);
    } else if (maxValue === map.get(key)) answer.push(key);
  });
  return answer.length !== 1 ? answer[1] : answer[0];
}

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
  const length = input.shift();
  const arr = input.map(Number).sort((a, b) => a - b);
  let sum = 0;
  for (let i = 0; i < length; i++) {
    sum += arr[i];
  }

  const result1 = Math.round(sum / length);
  const result2 = arr[parseInt(length / 2)];
  const result3 = mostValue(arr);
  const result4 = arr[length - 1] - arr[0];
  console.log(`${result1}\n${result2}\n${result3}\n${result4}`);
});
