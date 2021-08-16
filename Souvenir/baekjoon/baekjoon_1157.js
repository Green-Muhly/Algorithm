/*
    단어공부
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
    단, 대문자와 소문자를 구분하지 않는다.
 */
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  let answer = line.toLowerCase().split("");
  let output = Array.from({ length: 26 }, () => 0);

  const alphabet = [
    "a",
    "b",
    "c",
    "d",
    "e",
    "f",
    "g",
    "h",
    "i",
    "j",
    "k",
    "l",
    "m",
    "n",
    "o",
    "p",
    "q",
    "r",
    "s",
    "t",
    "u",
    "v",
    "w",
    "x",
    "y",
    "z",
  ];
  answer.map((a) => output[alphabet.indexOf(a)]++);

  const max = Math.max(...output);
  const maxIndex = output.indexOf(max);

  let check = false;

  for (let i = 0; i < output.length; i++) {
    if (output[i] === max && maxIndex !== i) {
      check = true;
      break;
    }
  }

  console.log(check ? "?" : alphabet[maxIndex].toUpperCase());
  rl.close();
}).on("close", function () {
  process.exit();
});
