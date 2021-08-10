/*
    연속부분수열2
    N개의 수로 이루어진 수열이 주어집니다.
    이 수열에서 연속부분수열의 합이 특정숫자 M 이하가 되는 경우가 몇번이 있는지 구하는 
    프로그램을 작성하세요.
    만약 N=5, M=5이고 수열이 다음과 같다면
    1 3 1 2 3
    합이 5이하기 되는 연속 부분수열은 {1}, {3}, {1}, {2}, {3}, {1, 3}, {3, 1}, {1, 2}, {2, 3}, {1, 3, 1}
    총 10가지 입니다.
*/
const arr = [1, 3, 1, 2, 3];
const M = 5;
const soulution = (arr, M) => {
  let answer = 0;
  let sum = 0;
  let left = 0;
  // for (let left = 0; left < arr.length; left++) {
  //   right = left;
  //   while (sum <= 5) {
  //     sum += arr[right++];
  //     sum <= 5 ? answer++ : null;
  //   }
  //   sum = 0;
  // }

  for (let right = 0; right < arr.length; right++) {
    sum += arr[right];
    while (sum > M) {
      sum -= arr[left++];
    }
    answer += right - left + 1;
  }

  return answer;
};

console.log(soulution(arr, M));
