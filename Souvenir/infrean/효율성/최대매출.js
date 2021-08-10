/*
    최대매출
    현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의
    매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
    만약 N이 10이고 K는 3이면
    12 15 11 20 25 10 20 19 13 15 중
    연속된 3일간의 최대 매출액은 11 + 20 + 25 = 56만원입니다.

*/
/*
const arr = [12, 15, 11, 20, 25, 10, 20, 19, 13, 15];
const K = 3;
const soulution = (arr, K) => {
  let answer = 0;
  let sum = 0;
  for (let i = 0; i < arr.length - 2; i++) {
    for (let tmp = i; tmp < i + 3; tmp++) {
      sum += arr[tmp];
    }
    answer = Math.max(answer, sum);

    sum = 0;
  }
  return answer;
};

console.log(soulution(arr, K));
*/
const arr = [12, 15, 11, 20, 25, 10, 20, 19, 13, 15];
const K = 3;
const soulution = (arr, K) => {
  let answer = 0;
  let sum = 0;

  for (let i = 0; i < K; i++) sum += arr[i];
  answer = sum;
  for (let i = K; i < arr.length; i++) {
    sum += arr[i] - arr[i - K];
    answer = Math.max(answer, sum);
  }

  return answer;
};

console.log(soulution(arr, K));
