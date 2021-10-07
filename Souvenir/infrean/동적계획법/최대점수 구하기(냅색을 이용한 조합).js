/*
   최대 점수 구하기
   이번 정보올림피아드 대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신
   N개의 문제를 풀려고 합니다. 각 문제는 그것을 풀었을 때 얻는 점수와 푸는데
   걸리는 시간이 주어지게 됩니다. 제한시간 M안에 N개의 문제 중
   최대 점수를 얻을 수 있도록 해야 합니다. (해당 문제는 해당 시간이 걸리면
    푸는걸로 간주하낟. 한 유형당 한개만 풀 수 있다.)
*/
const time = 20;
const arr = [
  [10, 5],
  [25, 12],
  [15, 8],
  [6, 3],
  [7, 4],
];
const soulution = (time, arr) => {
  let answer = 0;
  // dy[j] = j시간 동안 얻을 수 있는 최대 점수
  let dy = Array.from({ length: time + 1 }, () => 0);
  for (let i = 0; i < arr.length; i++) {
    let ps = arr[i][0];
    let pt = arr[i][1];
    for (let j = time; j >= pt; j--) {
      dy[j] = Math.max(dy[j], dy[j - pt] + ps);
    }
  }
  answer = dy[time];
  return answer;
};

console.log(soulution(time, arr));
