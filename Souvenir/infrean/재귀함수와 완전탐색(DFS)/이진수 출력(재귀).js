/*
    이진수 출력
    10진수 N이 2진수로 변환하여 출력하는 프로그램을 작성하세요.
*/
const N = 11;

const soulution = (N) => {
  let answer = "";
  function DFS(L) {
    if (L === 0) {
      return;
    } else {
      DFS(parseInt(L / 2));
      answer += L % 2;
    }
  }

  DFS(N);
  return answer;
};
console.log(soulution(N));
