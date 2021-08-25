/*
    삽입 정렬
    N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
    정렬하는 방법은 삽입정렬입니다.
*/
const arr = [11, 7, 5, 6, 10, 9];

const soulution = (arr) => {
  // 내가 푼 방법
  // for (let i = 0; i < arr.length - 1; i++) {
  //   let temp = i + 1;
  //   for (let j = i; j >= 0; j--) {
  //     if (arr[temp] < arr[j]) {
  //       [arr[temp], arr[j]] = [arr[j], arr[temp]];
  //       temp = j;
  //     }
  //   }
  // }

  let j;
  for (let i = 1; i < arr.length; i++) {
    let tmp = arr[i];
    for (j = i - 1; j >= 0; j--) {
      if (arr[j] > tmp) {
        arr[j + 1] = arr[j];
      } else break;
    }
    arr[j + 1] = tmp;
  }

  return arr;
};

console.log(soulution(arr));
