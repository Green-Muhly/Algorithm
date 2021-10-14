function solution(n) {
  var answer = Number.MAX_SAFE_INTEGER;
  for (let i = 2; i < n; i++) {
    if (n % i === 1) {
      return (answer = Math.min(answer, i));
    }
  }
  return answer;
}
console.log(solution(12));
