/*
   철수는 계단을 오를때 한번에 한계단 또는 두계단씩 올라간다. 만약 총 4계단을 오른다면
   1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 5가지이다.
   총 N계단일 경우 철수가 올라갈 수 있는 방법의 수는 몇가지인가.
*/
const N = 7;
const soulution = (N) => {
  let answer = 0;
  let dy = Array.from({ length: N + 1 }, () => 0);

  dy[1] = 1;
  dy[2] = 2;
  for (let i = 3; i <= N; i++) {
    dy[i] = dy[i - 2] + dy[i - 1];
  }

  answer = dy[N];
  return answer;
};

console.log(soulution(N));
