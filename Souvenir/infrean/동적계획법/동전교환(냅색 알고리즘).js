/*
   다음과 같이 여러 단위의 동전들이 주어져있을때, 거스름돈을 가장 적은 수의
   동전으로 교환해주려면 어떻게 주면 되는가
*/
const arr = [1, 2, 5];
const M = 15;
const soulution = (arr, M) => {
  let answer = 0;
  let dy = Array.from({ length: M + 1 }, () => 1000); // i금액을 거슬러주는데 사용된 최소 동전 개수

  dy[0] = 0;
  for (let i = 0; i < arr.length; i++) {
    for (let j = arr[i]; j <= M; j++) {
      dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1);
    }
    console.log(dy);
  }
  answer = dy[M];
  return answer;
};

console.log(soulution(arr, M));
