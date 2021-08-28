/*
    결혼식
    현수는 다음달에 결혼을 합니다.
    현수는 결혼식 피로연을 장소를 빌려 3일간 쉬지않고 하려고 합니다.
    피로연에 참석하는 친구들 N명의 참석하는 시간정보를 현수는 친구들에게 미리 요구했습니다.
    각 친구들은 자신이 몇시에 도착해서 몇시에 떠날 것인지 현수에게 알려주었습니다.
    현수는 이 정보를 바탕으로 피로연 장소에 동시에 존재하는 최대 인원수를 구하여 그 인원을
    수용할 수 있는 장소를 질리려고 합니다.
*/
const arr = [
  [14, 18],
  [12, 15],
  [15, 20],
  [20, 30],
  [5, 14],
];

const soulution = (arr) => {
  let answer = 0;
  let timeLine = [];

  for (let i = 0; i < arr.length; i++) {
    timeLine.push([arr[i][0], "s"]);
    timeLine.push([arr[i][1], "e"]);
  }

  timeLine.sort((a, b) => {
    if (a[0] === b[0]) return a[1].charCodeAt() - b[1].charCodeAt();
    else return a[0] - b[0];
  });

  let cnt = 0;
  for (const x of timeLine) {
    if (x[1] === "s") cnt++;
    else cnt--;
    answer = Math.max(answer, cnt);
  }

  console.log(timeLine);

  return answer;
};

console.log(soulution(arr));
