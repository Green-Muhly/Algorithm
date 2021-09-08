/*
    최대 점수 구하기
    어떤 정보 올림피아드에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를
    풀려고 합니다. 각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게
    됩니다. 제한시간 M 안에 N개의 문제중 최대 점수를 얻을 수 있도록 해야 합니다.
*/
const arr = [
  [10, 5],
  [25, 12],
  [15, 8],
  [6, 3],
  [7, 4],
];
const M = 20;

const soulution = (arr, M) => {
  let answer = Number.MIN_SAFE_INTEGER;
  arr.sort((a, b) => {
    return a[0] === b[0] ? a[1] - b[1] : a[0] - b[0];
  });
  const N = arr.length;
  function D(L, sum, time) {
    if (time > 20) return;
    if (L === N) {
      answer = Math.max(answer, sum);
    } else {
      D(L + 1, sum + arr[L][0], time + arr[L][1]);
      D(L + 1, sum, time);
    }
  }
  D(0, 0, 0);
  return answer;
};

console.log(soulution(arr, M));
