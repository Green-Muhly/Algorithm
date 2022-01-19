// 최소공배수 (실버5)

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
  if (input.length === parseInt(input[0]) + 1) rl.close();
}).on("close", function () {
  input.shift();

  input.map((numArr) => {
    const [num1, num2] = numArr.split(" ").map(Number);

    const gcdNum = gcd(num1, num2);
    console.log((num1 * num2) / gcdNum);
  });
});
