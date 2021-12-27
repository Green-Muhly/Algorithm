/*
  시험 성적(브론즈4)
  
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
  const num = parseInt(input[0]);

  if (num >= 90) console.log("A");
  else if (num >= 80) console.log("B");
  else if (num >= 70) console.log("C");
  else if (num >= 60) console.log("D");
  else console.log("F");
});
