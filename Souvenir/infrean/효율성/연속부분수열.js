/*
    연속부분수열1
    N개의 수로 이루어진 수열이 주어진다.
    이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇번 있는지 구하는 프로그램을 작성하세요.
    만약 N=8, M=6이고 수열이 다음과 같다면
    1 2 1 3 1 1 1 2
    합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지이다.
*/
const arr = [1, 2, 1, 3, 1, 1, 1, 2];
const M = 6;

const soulution = (arr, M) => {
  let answer = 0;
  let left = 0;
  let sum = 0;
  // for (left = 0; left < arr.length; left++) {
  //   let sum = 0;
  //   right = left;
  //   while (sum < 6) {
  //     sum += arr[right++];
  //   }
  //   sum === 6 ? answer++ : null;
  // }
  for (let right = 0; right < arr.length; right++) {
    sum += arr[right];
    if (sum === M) answer++;
    while (sum >= M) {
      sum -= arr[left++];
      if (sum === M) answer++;
    }
  }

  return answer;
};

console.log(soulution(arr, M));
