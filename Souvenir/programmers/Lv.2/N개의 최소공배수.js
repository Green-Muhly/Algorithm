/*
  유클리드 호제법
  1. a,b를 서로 나눈다. 만약 나누어진다면 b가 최대 공약수이다.(a>b)
  2. 만약 서로가 나누어지지 않는다면 b와 a%b(a를 b로 나눈 나머지)를 다시 나눈다.
  3. 서로가 나누어진다면 a%b가 최대 공약수이다. 나누어지지 않는다면 위 방법을 반복한다.
  4. 최소 공배수는 두수의 곱을 최대 공약수로 나눈 값이다.
*/
const gcd = (a, b) => {
  if (b === 0) return a;
  return gcd(b, a % b);
};
const lcm = (a, b) => {
  return (a * b) / gcd(a, b);
};
function solution(arr) {
  let answer = 1;
  arr.map((x) => {
    answer = lcm(x, answer);
  });
  return answer;
}

/*
  다른사람 풀이 reduce 사용!
  const gcd = (a, b) => (b % a === 0) ? a : gcd(b % a, a);
  const lcm = (a, b) => a * b / gcd(a, b);

  function solution(arr){
    return arr.sort().reduce((a, b) => lcm(a, b));
  } 
*/
