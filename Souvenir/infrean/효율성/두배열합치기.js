/*
    두 배열 합치기
    오름차순으로 정렬된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요
*/
const arr1 = [1, 3, 5];
const arr2 = [2, 3, 6, 7, 9];
const soulution = (arr1, arr2) => {
  let answer = [];
  let p1 = (p2 = 0);
  let n = arr1.length;
  let m = arr2.length;

  while (p1 < n && p2 < m) {
    if (arr1[p1] <= arr2[p2]) answer.push(arr1[p1++]);
    else answer.push(arr2[p2++]);
  }
  while (p1 < n) answer.push(arr1[p1++]);
  while (p2 < m) answer.push(arr2[p2++]);

  // for (let i = 0; i < arr1.length + arr2.length; i++) {
  //   if (arr1[p1] < arr2[p2]) {
  //     answer[i] = arr1[p1];
  //     p1++;
  //   } else {
  //     answer[i] = arr2[p2];
  //     p2++;
  //   }
  // }
  return answer;
};

console.log(soulution(arr1, arr2));
