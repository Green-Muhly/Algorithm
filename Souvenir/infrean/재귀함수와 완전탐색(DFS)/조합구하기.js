/*
    조합 구하기
    1부터 N까지 번호가 적힌 구슬이 있다 이중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하세요
*/
const N = 4;
const M = 2;

const soulution = (N, M) => {
  let answer = [];
  let tmp = Array.from({ length: M }, () => 0);
  function D(L, sNum) {
    if (L === M) {
      answer.push(tmp.slice());
    } else {
      for (let i = sNum; i <= N; i++) {
        tmp[L] = i;
        D(L + 1, i + 1);
      }
    }
  }
  D(0, 1);
  return [answer, answer.length];
};

console.log(soulution(N, M));
