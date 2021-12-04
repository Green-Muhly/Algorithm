/*
  소수(실버 5)
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
  if (time === 2) rl.close();
}).on("close", function () {
  const sNum = parseInt(input[0]);
  const eNum = parseInt(input[1]);
  let primeArr = [];
  for (let i = sNum; i <= eNum; i++) {
    if (isPrime(i)) primeArr.push(i);
  }
  if (primeArr.length === 0) {
    console.log(-1);
    return;
  }
  console.log(primeArr.reduce((acc, cur) => acc + cur, 0));
  console.log(primeArr[0]);
});

function isPrime(num) {
  if (num === 1) return false;
  for (let i = 2; i < num; i++) {
    if (num % i === 0) return false;
  }
  return true;
}
