/*
  소수 구하기(실버 2)
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
  const [sNum, eNum] = input[0].split(" ").map(Number);
  let isPrimeNumber = Array(eNum + 1).fill(true);
  isPrimeNumber[1] = false;

  for (let n = 2; n <= Math.ceil(Math.sqrt(eNum)); n++) {
    if (isPrimeNumber[n]) {
      let m = 2;
      while (n * m <= eNum) {
        isPrimeNumber[n * m] = false;
        m++;
      }
    }
  }

  let results = [];
  for (let n = sNum; n <= eNum; n++) {
    if (isPrimeNumber[n]) {
      results.push(n);
    }
  }
  console.log(results.join("\n"));
});

function isPrime(num) {
  if (num === 1) return false;
  for (let i = 2; i < num; i++) {
    if (num % i === 0) return false;
  }
  return true;
}
