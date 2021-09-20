/*
    수들의 조합
    N개의 정수가 주어지면 그 숫자들 중 K개를 뽑는 조합의 합이 임의의 정수 M의
    배수인 개수는 몇개가 들어있는지 출력하는 프로그램을 작성하세요.
    예를들어 2 4 5 8 12가 주어지고 3개를 뽑은 조합의 합이 6의 배수인
    조합을 찾으면 4+8+12 2+4+12로 2가지가 있습니다.
*/
const K = 3;
const arr = [2, 4, 5, 8, 12];
const M = 6;

const soulution = (K, arr, M) => {
  let answer = 0;
  function D(L, s, sum) {
    if (L === K) {
      if (sum % M === 0) {
        answer++;
      }
    } else {
      for (let i = s; i < arr.length; i++) {
        D(L + 1, i + 1, sum + arr[i]);
      }
    }
  }
  D(0, 0, 0);
  return answer;
};

console.log(soulution(K, arr, M));
