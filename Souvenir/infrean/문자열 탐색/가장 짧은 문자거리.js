/*
    가장 짧은 문자거리
    한개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요
*/

const str = "teachermode";
const s = "e";

const soulution = (str, s) => {
  let arr = [];
  let arr2 = [];
  let count = 1000;
  for (let i = 0; i < str.length; i++) {
    if (str[i] === s) count = 0;
    else count++;
    arr.push(count);
  }
  count = 1000;
  for (i = str.length - 1; i >= 0; i--) {
    if (str[i] === s) {
      count = 0;
      arr[i] = count;
    } else {
      count++;
      arr[i] = Math.min(arr[i], count);
    }
  }
  return arr;
};

console.log(soulution(str, s));
