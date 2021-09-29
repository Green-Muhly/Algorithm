/*
   섬나라 아일랜드
   N*N의 섬나라 아일랜드 지도가 격자판의 정보로 주어지낟. 각 섬은 
   1로 표시되어 상하좌우와 대각선으로 연결되어있으며, 0은 바다입니다.
   섬나라 아일랜드에 몇개의 섬이 있는지 구하는 프로그램을 작성하세요
*/
let arr = [
  [1, 1, 0, 0, 0, 1, 0],
  [0, 1, 1, 0, 1, 1, 0],
  [0, 1, 0, 0, 0, 0, 0],
  [0, 0, 0, 1, 0, 1, 1],
  [1, 1, 0, 1, 1, 0, 0],
  [1, 0, 0, 0, 1, 0, 0],
  [1, 0, 1, 0, 1, 0, 0],
];

const soulution = (arr) => {
  let answer = 0;
  let n = arr.length;
  let dx = [-1, -1, 0, 1, 1, 1, 0, -1];
  let dy = [0, 1, 1, 1, 0, -1, -1, -1];

  function DFS(x, y) {
    arr[x][y] = 0;
    for (let k = 0; k < 8; k++) {
      let nx = x + dx[k];
      let ny = y + dy[k];
      if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] === 1) {
        DFS(nx, ny);
      }
    }
  }

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      if (arr[i][j] === 1) {
        answer++;
        DFS(i, j);
      }
    }
  }

  return answer;
};

console.log(soulution(arr));
