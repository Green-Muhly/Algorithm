/*
    등수구하기
    N(1<=N<=100)명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 
    프로그램을 작성하세요.

    입력 설명
    첫 줄에 N(3<=N<=1000)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력
    된다. 같은 점수가 입력될 경우 높은 등수로 동일 처리한다. 즉 가장 높은 점수가 92점인데 
    92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

    출력 설명
    입력된 순서대로 등수를 출력한다.

*/

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
rl.on("line", function (line) {
  input.push(line);
  rl.close();
}).on("close", function () {
  const inputArr = input[0].split(" ").map(Number);
  let answer = Array(inputArr.length).fill(1);
  for (let i = 0; i < inputArr.length; i++) {
    for (let j = 0; j < inputArr.length; j++) {
      if (inputArr[j] > inputArr[i]) {
        answer[i]++;
      }
    }
  }

  console.log(answer);
  process.exit();
});
