function solution(a, b) {
  var answer = 0;
  const n = a.length;

  for (let i = 0; i < n; i++) {
    answer += a[i] * b[i];
  }
  return answer;
}

// 다른 사람 풀이
function solution(a, b) {
  return a.reduce((acc, _, i) => (acc += a[i] * b[i]), 0);
}
