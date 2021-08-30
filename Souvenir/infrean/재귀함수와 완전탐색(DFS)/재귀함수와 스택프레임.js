/*
    재귀함수
    자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
*/
const N = 3;

const soulution = (N) => {
  function DFS(L) {
    if (L === 0) return;
    else {
      DFS(L - 1);
      console.log(L);
    }
  }

  DFS(N);
};
soulution(N);
// console.log();
