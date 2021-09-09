/*
    중복순열
    1부터 N까지 적힌 구슬이 있다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
    다중 for문과 재귀의 차이
*/
const N = 3;
const M = 2;

const solution2 = (N, M) => {
  let answer = 0;
  for (let i = 1; i <= N; i++) {
    for (let j = 1; j <= N; j++) {
      console.log(i, j);
      answer++;
    }
  }
  return answer;
};

const soulution = (N, M) => {
  let answer = [];

  let tmp = Array.from({ length: M }, () => 0);
  function DFS(L) {
    if (L === M) {
      // console.log(tmp);
      // answer++;
      answer.push(tmp.slice());
    } else {
      for (let i = 1; i <= N; i++) {
        tmp[L] = i;
        DFS(L + 1);
      }
    }
  }
  DFS(0);
  return [answer, answer.length];
};

console.log(soulution(N, M));
// console.log(solution2(N, M));
