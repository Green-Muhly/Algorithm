/*
  블랙잭(브론즈1)
  
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
  const NM = input[0].split(" ").map(Number);
  const input_array = input[1].split(" ").map(Number);
  const N = NM.shift();
  const M = NM.shift();
  let max = 0;
  for (let i = 0; i < N - 2; i++) {
    for (let j = i + 1; j < N - 1; j++) {
      for (let k = j + 1; k < N; k++) {
        let sum = input_array[i] + input_array[j] + input_array[k];
        if (sum > max && sum <= M) {
          max = sum;
        }
      }
    }
  }
  console.log(max);
});
