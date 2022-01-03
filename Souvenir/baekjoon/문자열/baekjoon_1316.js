// 그룹 단어 체커 실버5

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
  const caseNum = parseInt(input.shift());
  let count = 0;

  for (let i = 0; i < caseNum; i++) {
    const word = input[i];
    const letter = [];
    let isGroupWord = true;

    for (let j = 0; j < word.length; j++) {
      if (letter.indexOf(word[j]) === -1) {
        letter.push(word[j]);
      } else {
        if (letter.indexOf(word[j]) !== letter.length - 1) {
          isGroupWord = false;
          break;
        }
      }
    }
    if (isGroupWord) {
      count++;
    }
  }

  console.log(count);
});
