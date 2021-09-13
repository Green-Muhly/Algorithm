/*
    
*/
const num = 5;

const soulution = (num) => {
  let answer = 0;

  /*
  내가 푼 풀이
  function DFS(L, sum) {
    if (L === 0) {
      answer = sum;
      return;
    } else {
      DFS(L - 1, sum * L);
    }
  }
  DFS(num, 1);
  */

  function DFS(n) {
    if (n === 1) return 1;
    else return DFS(n - 1) * n;
  }
  answer = DFS(n);
  return answer;
};

console.log(soulution(num));
