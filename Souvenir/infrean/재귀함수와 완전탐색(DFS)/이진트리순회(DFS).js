/*
    이진트리 순회(깊이 우선 탐색)
    전위순회, 중위순회, 후위순회
*/
const arr = [];

const soulution = (v) => {
  function DFS(v) {
    if (v > 7) return;
    else {
      DFS(v * 2);
      console.log(v);
      DFS(v * 2 + 1);
    }
  }
  DFS(v);
};
soulution(1);
