function solution(numbers) {
  var answer = 0;
  let arr = Array.from({ length: 10 }, () => 1);
  numbers.map((number) => {
    arr[number] -= 1;
  });
  arr.map((value, idx) => {
    if (value) {
      answer += idx;
    }
  });
  return answer;
}

// 다른사람 풀이
function solution(numbers) {
  return 45 - numbers.reduce((cur, acc) => cur + acc, 0);
}
