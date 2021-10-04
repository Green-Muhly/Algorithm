/*
   돌다리 건너기
   철수는 학교에 가는데 개울을 만났습니다. 개울은 N개의 돌로 다리를 만들어
   놓았습니다. 철수는 돌다리를 건널 때 한번에 한칸 또는 두칸씩 건너뛰면서 돌다리를 건널수있습니다.
   철수가 개울을 건너는 방법은 몇가지일까요?
*/
const N = 7;
const soulution = (N) => {
  let answer = 0;
  let dy = Array.from({ length: N + 1 }, () => 0);

  dy[1] = 1;
  dy[2] = 2;
  for (let i = 3; i <= N + 1; i++) {
    dy[i] = dy[i - 2] + dy[i - 1];
  }

  answer = dy[N + 1];
  return answer;
};

console.log(soulution(N));
