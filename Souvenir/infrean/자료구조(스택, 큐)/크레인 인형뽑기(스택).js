/*
    크레인 인형뽑기
    게임개발자인 죠르디는 크레인 인형뽑기 기계를 모바일 게임으로 만들려고 한다.
    죠르디는 게임의 재미를 높이기 위해 화면 구성과 규칙을 다음과 같이 게임 로직에 반영하려고 한다.

*/
const board = [
  [0, 0, 0, 0, 0],
  [0, 0, 1, 0, 3],
  [0, 2, 5, 0, 1],
  [4, 2, 4, 4, 2],
  [3, 5, 1, 3, 1],
];
const arr = [1, 5, 3, 5, 1, 2, 1, 4];

const soulution = (board, arr) => {
  let answer = 0;
  let stack = [];
  arr.forEach((pos) => {
    for (let i = 0; i < board.length; i++) {
      if (board[i][pos - 1] !== 0) {
        let temp = board[i][pos - 1];
        board[i][pos - 1] = 0;
        if (temp === stack[stack.length - 1]) {
          stack.pop();
          answer += 2;
        } else stack.push(temp);
        break;
      }
    }
  });
  return answer;
};

console.log(soulution(board, arr));
