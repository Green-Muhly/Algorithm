/*
    선택정렬
    N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
    정렬하는 방법은 선택정렬입니다.
*/
const arr = [13, 5, 11, 7, 23, 15];

const soulution = (arr) => {
  for (let i = 0; i < arr.length - 1; i++) {
    let idx = i;
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[idx]) idx = j;
    }
    [arr[i], arr[idx]] = [arr[idx], arr[i]];
  }
  return arr;
};

console.log(soulution(arr));
