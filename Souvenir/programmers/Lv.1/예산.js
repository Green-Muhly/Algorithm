function solution(d, budget) {
  var answer = 0;
  let sum = 0;
  d.sort((a, b) => a - b);
  console.log(d);

  for (const x of d) {
    if (sum + x <= budget) {
      sum = sum + x;
      answer++;
    }
  }
  return answer;
}
