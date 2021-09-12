/*
    동전교환
    다음과 같이 여러 단위의 동전들이 주어져 있을 때 거스름돈을 가장 적은 수의 동전으로
    교환해주려면 어떻게 주면 되는가? 각 단위의 동전은 무한정 쓸 수 있다.
*/
const arr = [1, 2, 5];
const M = 15;

const soulution = (arr, M) => {
  let answer = Number.MAX_SAFE_INTEGER;
  function DFS(L, sum) {
    if (sum > M) return;
    if (answer < L) return;
    if (sum === M) {
      answer = Math.min(answer, L);
    } else {
      for (let i = 0; i < arr.length; i++) {
        DFS(L + 1, sum + arr[i]);
      }
    }
  }
  DFS(0, 0);
  return answer;
};

console.log(soulution(arr, M));
