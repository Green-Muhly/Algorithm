function solution(lottos, win_nums) {
  const correctLength = lottos.filter((lotto) =>
    win_nums.includes(lotto)
  ).length;

  const zeroLength = lottos.filter((lotto) => lotto === 0).length;

  let min = 7 - correctLength >= 6 ? 6 : 7 - correctLength;
  let max = min - zeroLength < 1 ? 1 : min - zeroLength;

  return [max, min];
}

// 다른 사람 풀이
function solution(lottos, win_nums) {
  const rank = [6, 6, 5, 4, 3, 2, 1];

  let minCount = lottos.filter((v) => win_nums.includes(v)).length;
  let zeroCount = lottos.filter((v) => !v).length;

  const maxCount = minCount + zeroCount;

  return [rank[maxCount], rank[minCount]];
}
