/*
    수열 추측하기
    가장 윗줄에 1부터 N까지의 숫자가 한개씩 적혀있다. 그리고 둘째줄 부터
    차례대로 파스칼의 삼각형처럼 위의 두개를 더한 값이 저장되게 된다. 
    N과 가장 밑에 있는 숫자가 주어져 있을 때 가장 윗줄에 있는 숫자를 구하는 프로그램을 작성하시오.
    여러가지가 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력하여야 한다.
*/
const n = 4;
const last = 16;

const soulution = (n, last) => {
  let answer,
    flag = 0;

  let dy = Array.from(Array(n + 1), () => Array(n + 1).fill(0));
  let ch = Array.from({ length: n + 1 }, () => 0);
  let p = Array.from({ length: n }, () => 0); //순열
  let b = Array.from({ length: n }, () => 0); //조합ㄱ밧
  function combi(n, r) {
    if (dy[n][r] > 0) {
      return dy[n][r];
    }
    if (r === 0 || r === n) {
      return 1;
    } else {
      return (dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r));
    }
  }
  function DFS(L, sum) {
    if (flag) return;
    if (L === n && sum === last) {
      answer = p.slice();
      flag = 1;
      return;
    } else {
      for (let i = 1; i <= n; i++) {
        if (ch[i] === 0) {
          ch[i] = 1;
          p[L] = i;
          DFS(L + 1, sum + b[L] * p[L]);
          ch[i] = 0;
        }
      }
    }
  }

  for (let i = 0; i < n; i++) {
    b[i] = combi(n - 1, i);
  }
  DFS(0, 0);
  return answer;
};

console.log(soulution(n, last));
