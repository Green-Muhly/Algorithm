/*
   경로탐색(인접리스트) - 정점 개수가 많을때
   방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지
   수를 출력하는 프로그램을 작성하세요.
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
  let graph = Array.from(Array(N + 1), () => Array());
  let ch = Array.from({ length: N + 1 }, () => 0);
  let path = [];

  for (let [a, b] of arr) {
    graph[a].push(b);
  }

  function DFS(v) {
    if (v === N) {
      answer++;
      console.log(path);
    } else {
      for (let i = 0; i < graph[v].length; i++) {
        if (ch[graph[v][i]] === 0) {
          ch[graph[v][i]] = 1;
          path.push(graph[v][i]);
          DFS(graph[v][i]);
          ch[graph[v][i]] = 0;
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
