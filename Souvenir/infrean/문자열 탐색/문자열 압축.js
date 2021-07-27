/*
    문자열 압축
    알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우
    반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
    단, 반복횟수가 1인 경우 생략합니다.
*/

const str = "KKHSSSSSSSE";

const soulution = (str) => {
  let count = 1;
  let answer = "";
  for (let i = 0; i < str.length; i++) {
    if (i === 0) answer += str[i];
    else {
      if (str[i] === str[i - 1]) {
        count++;
      } else {
        count === 1 ? null : (answer += count);
        answer += str[i];
        count = 1;
      }
    }
  }
  return answer;
};

console.log(soulution(str));
