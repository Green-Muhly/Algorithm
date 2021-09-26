/*
   미로탐색
   격자판의 1은 벽이고 0은 통로다.
   출발점은 1,1이고 도착점은 7,7이다.

*/

const arr = [
  [0, 0, 0, 0, 0, 0, 0],
  [0, 1, 1, 1, 1, 1, 0],
  [0, 0, 0, 1, 0, 0, 0],
  [1, 1, 0, 1, 0, 1, 1],
  [1, 1, 0, 0, 0, 0, 1],
  [1, 1, 0, 1, 1, 0, 0],
  [1, 0, 0, 0, 0, 0, 0],
];

const soulution = (arr) => {
  let answer = 0;
  let dx = [-1, 0, 1, 0];
  let dy = [0, 1, 0, -1];
  function D(x, y) {
    if (x === 6 && y === 6) {
      answer++;
    } else {
      for (let k = 0; k < 4; k++) {
        let nx = x + dx[k];
        let ny = y + dy[k];
        if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && arr[nx][ny] === 0) {
          arr[nx][ny] = 1;
          D(nx, ny);
          arr[nx][ny] = 0;
        }
      }
    }
  }
  arr[0][0] = 1;
  D(0, 0);
  return answer;
};

console.log(soulution(arr));
