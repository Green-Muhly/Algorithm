/*
  경로탐색(인접행렬)
  방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요. 
*/
const N = 5;
const arr = [
  [1, 2],
  [1, 3],
  [1, 4],
  [2, 1],
  [2, 3],
  [2, 5],
  [3, 4],
  [4, 2],
  [4, 5],
];
const soulution = (N, arr) => {
  let answer = 0;
  let graph = Array.from(Array(N + 1), () => Array(N + 1).fill(0));
  let ch = Array.from({ length: N + 1 }, () => 0);
  let path = [];

  for (let [a, b] of arr) {
    graph[a][b] = 1;
  }

  function DFS(v) {
    if (v === N) {
      answer++;
      console.log(path);
    } else {
      for (let i = 1; i <= N; i++) {
        if (graph[v][i] === 1 && ch[i] === 0) {
          ch[i] = 1;
          path.push(i);
          DFS(i);
          ch[i] = 0;
          path.pop();
        }
      }
    }
  }
  path.push(1);
  ch[1] = 1;
  DFS(1);
  return answer;
};

console.log(soulution(N, arr));
