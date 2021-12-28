/*
  사분면 고르기(브론즈4)
  
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
  const x = parseInt(input[0]);
  const y = parseInt(input[1]);

  if (x > 0 && y > 0) console.log(1);
  else if (x > 0 && y < 0) console.log(4);
  else if (x < 0 && y < 0) console.log(3);
  else console.log(2);
});
