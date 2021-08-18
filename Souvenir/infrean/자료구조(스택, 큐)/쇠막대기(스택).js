/*
    쇠막대기(스택)
    여러개의 쇠막대기를 레이저로 절단하려고 한다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로
    겹쳐 놓고 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자른다. 쇠막대기와 레이저의 배치는 다음 조건을 만족한다.
    o 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓을 수 있다. - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않는다.
    o 각 쇠막대기를 자르는 레이저는 적어도 하나 존재한다.
    o 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
*/
const str = "()(((()())(())()))(())";

const soulution = (str) => {
  let answer = 0;
  let stack = [];

  for (let i = 0; i < str.length; i++) {
    if (str[i] === "(") stack.push(str[i]);
    else {
      stack.pop();
      if (str[i - 1] === "(") answer += stack.length;
      else answer += 1;
    }
  }

  return answer;
};

console.log(soulution(str));
