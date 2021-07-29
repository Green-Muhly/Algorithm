/*
    자릿수의 합
    N개의 자연수가 입력되면 각 자연수의 자릿수의 합을 구하고, 그 합이 최대인 자연수를 출력하는
    프로그램을 작성하세요. 자릿수의 합이 같은 경우 원래 숫자가 큰 숫자를 다븡로 합니다.
    만약 235와 1234가 동시에 답이 될 수 있다면 1234를 답으로 출력해야 합니다.
*/
const arr = [128, 460, 603, 40, 521, 137, 123];
const soulution = (arr) => {
  let answer;
  let max = Number.MIN_SAFE_INTEGER;
  for (let x of arr) {
    // let sum = 0,
    //   temp = x;
    // while (temp) {
    //   sum += temp % 10;
    //   temp = Math.floor(temp / 10);
    // }
    let sum = x
      .toString()
      .split("")
      .map(Number)
      .reduce((a, b) => a + b, 0);
    if (sum > max) {
      max = sum;
      answer = x;
    } else if (sum === max) {
      answer = answer > x ? answer : x;
    }
  }

  return answer;
};

console.log(soulution(arr));
