/*
    조합의 경우 수
    nCr로 계산한다. 
    nCr = n-1Cr-1 + n-1Cr
*/
const n = 33;
const r = 19;

const soulution = (n, r) => {
  let answer;
  let dy = Array.from(Array(n + 1), () => Array(r + 1).fill(0));
  // console.log(dy);
  function DFS(n, r) {
    if (dy[n][r] > 0) {
      return dy[n][r];
    }
    if (r === 0 || r === n) {
      return 1;
    } else {
      return (dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r));
    }
  }
  answer = DFS(n, r);
  return answer;
};

console.log(soulution(n, r));
