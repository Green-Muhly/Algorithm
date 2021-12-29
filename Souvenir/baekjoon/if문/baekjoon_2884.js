/*
  알람 시계(브론즈3)
  
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
  const [hour, minute] = input[0].split(" ").map(Number);
  let [newH, newM] = [0, 0];
  if (minute < 45) {
    newM = 60 + minute - 45;
    if (hour === 0) {
      newH = 23;
    } else {
      newH = hour - 1;
    }
  } else {
    newM = minute - 45;
    newH = hour;
  }
  console.log(newH, newM);
});
