/*
    공주구하기
    정보 왕국의 이웃나라 외동딸 공주가 숲속의 괴물에게 잡혀갔습니다.
    정보 왕국에는 왕자가 N명이 있는데 서로 공주를 구하러 가겠다고 합니다. 정보왕국의 왕은
    다음과 같은 방법으로 공주를 구하러 갈 왕자를 결정하기로 했습니다.
    왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다. 그리고 1번 왕자부터
    N번의 왕자까지 순서대로 시계방향으로 돌아가며 동그랗게 앉게한다. 그리고 1번 왕자부터 
    시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다. 한 왕자가 K를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고
    원 밖으로 나오게 된다. 그리고 다음 왕자부터 다시 1부터 시작하여 번호를 외친다.
    이렇게 해서 마지막까지 남은 왕자가 공주를 구하러 갈 수 있다.
*/
const str = "";

const soulution = (n, k) => {
  let answer;
  let queue = Array.from({ length: n }, (v, i) => i + 1);

  while (queue.length) {
    for (let i = 1; i < k; i++) queue.push(queue.shift());
    queue.shift();
    if (queue.length === 1) answer = queue.shift();
  }
  return answer;
};

console.log(soulution(8, 3));
