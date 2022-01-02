// 크로아티아 알파벳 실버5

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
  console.log(input[0].replace(/c=|c-|dz=|d-|lj|nj|s=|z=|./g, "a").length);
});

/*
  다른 사람 풀이
  function solution(str) {

    let croatia = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="];

        for (let alphabet of croatia) {
          str = str.split(alphabet).join("Q"); //이 부분이 가장 핵심.
        }
  console.log(str.length)
}

 */
