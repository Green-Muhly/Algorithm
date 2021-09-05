/*
    합이 같은 부분집합
    N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두개의 부분집합으로 나누었을 때,
    두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 Yes를 출력하고 그렇지 않으면 No를
    출력하는 프로그램을 작성하세요.
    둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진
    원래의 집합이 된다.
*/
const arr = [1, 3, 5, 6, 7, 10];

const soulution = (arr) => {
  let answer = "NO";
  let flag = 0;
  const total = arr.reduce((a, b) => a + b, 0);
  const N = arr.length;
  function DFS(L, sum) {
    if (flag) return;
    if (L === N) {
      if (total - sum === sum) {
        answer = "YES";
        flag = 1;
      }
    } else {
      DFS(L + 1, sum + arr[L]);
      DFS(L + 1, sum);
    }
  }
  DFS(0, 0);
  return answer;
};

console.log(soulution(arr));
