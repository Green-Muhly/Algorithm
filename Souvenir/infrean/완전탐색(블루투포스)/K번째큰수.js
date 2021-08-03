/*
    K번째 큰 수
    현수는 1부터 100사이의 자연수가 적신 N장의 카드를 가지고 있다. 같은 숫자의 카드가 여러장 있을 수 있다.
    현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려 한다. 3장을 뽑을 수 있는 모든 경우를 기록한다.
    기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하자.
    만약 큰수가 만들어진 수가 25 25 23 23 22 20 19....이고 K값이 3이라면 K번째 큰 값은 22이다.
*/
const arr = [13, 15, 34, 23, 45, 65, 33, 11, 26, 42];
const k = 3;

const soulution = (arr, k) => {
  let answer = new Set();
  let n = arr.length;
  for (let i = 0; i < n; i++) {
    for (let j = i + 1; j < n; j++) {
      for (let l = j + 1; l < n; l++) {
        answer.add(arr[i] + arr[j] + arr[l]);
      }
    }
  }
  let temp = Array.from(answer).sort((a, b) => b - a);

  return temp[k - 1];
};

console.log(soulution(arr, k));
