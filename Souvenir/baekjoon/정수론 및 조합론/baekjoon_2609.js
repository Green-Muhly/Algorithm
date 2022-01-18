// 최대공약수와 최소공배수

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
let time = 0;

function gcd(a, b) {
  if (b === 0) return a;
  return gcd(b, a % b);
}

rl.on("line", function (line) {
  input.push(line);
  time++;
  if (time === 1) rl.close();
}).on("close", function () {
  let [num1, num2] = input[0].split(" ").map(Number);
  const result1 = gcd(num1, num2);
  console.log(result1);
  console.log((num1 * num2) / result1);
});
