/*
    순열 구하기
    10이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을
    모두 출력합니다.
*/
const arr = [3, 6, 9];
const M = 2;

const soulution = (arr, M) => {
  let answer = [];
  let tmp = Array.from({ length: M }, () => 0);
  const N = arr.length;
  let check = Array.from({ length: N }, () => 0);
  function DFS(L) {
    if (L === M) {
      answer.push(tmp.slice());
    } else {
      for (let i = 0; i < N; i++) {
        if (check[i] === 0) {
          check[i] = 1;
          tmp[L] = arr[i];
          DFS(L + 1);
          check[i] = 0;
        }
      }
    }
  }
  DFS(0);
  return answer;
};

console.log(soulution(arr, M));
