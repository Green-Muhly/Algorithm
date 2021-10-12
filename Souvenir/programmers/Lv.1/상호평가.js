const checkScore = (score) => {
  if (score >= 90) return "A";
  else if (score >= 80) return "B";
  else if (score >= 70) return "C";
  else if (score >= 50) return "D";
  else return "F";
};

function solution(scores) {
  let answer = "";
  const length = scores.length;
  for (let j = 0; j < length; j++) {
    const selfScore = scores[j][j];
    let count = scores.length;

    let min = 101;
    let max = -1;
    let flag = true;
    let sum = 0;

    for (let i = 0; i < length; i++) {
      let score = scores[i][j];
      if (i !== j && selfScore === score) {
        flag = false;
      }

      min = Math.min(min, score);
      max = Math.max(max, score);

      sum += score;
    }
    if (flag && (min === selfScore || max === selfScore)) {
      count--;
      sum -= selfScore;
    }
    answer += checkScore(sum / count);
  }
  return answer;
}
