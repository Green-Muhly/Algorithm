/*
    등수구하기
    N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


    입력 설명
    첫 줄에 자연수 N이 주어진다.(1<=N<=50) 
    두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다. 

    출력 설명
    최대합을 출력한다.

*/

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  rl.close();
}).on("close", function () {
  let arr = [
    [5, 3, 7, 2, 3],
    [3, 7, 1, 6, 1],
    [7, 2, 5, 3, 4],
    [4, 3, 6, 4, 1],
    [8, 7, 3, 5, 2],
  ];
  let answer = 0;

  const dx = [-1, 0, 1, 0];
  const dy = [0, 1, 0, -1];
  for (let i = 0; i < 5; i++) {
    for (let j = 0; j < 5; j++) {
      let flag = 1;
      for (let k = 0; k < 4; k++) {
        let nx = i + dx[k];
        let ny = j + dy[k];
        if (
          nx >= 0 &&
          nx < 5 &&
          ny >= 0 &&
          ny < 5 &&
          arr[nx][ny] >= arr[i][j]
        ) {
          flag = 0;
          break;
        }
      }
      if (flag === 1) answer++;
    }
  }

  console.log(answer);
  process.exit();
});
