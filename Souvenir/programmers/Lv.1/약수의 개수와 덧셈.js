function divisors(integer) {
  let sum = 1;
  for (var i = 2; i <= integer; i++) {
    if (integer % i == 0) {
      sum++;
    }
  }
  return sum;
}

function solution(left, right) {
  var answer = 0;
  for (let i = left; i <= right; i++) {
    if (divisors(i) % 2) {
      answer -= i;
    } else {
      answer += i;
    }
  }
  return answer;
}

// 다른사람의 풀이
// 제곱근이 정수면 약수의 갯수가 홀수
function solution(left, right) {
  var answer = 0;
  for (let i = left; i <= right; i++) {
    if (Number.isInteger(Math.sqrt(i))) {
      answer -= i;
    } else {
      answer += i;
    }
  }
  return answer;
}
