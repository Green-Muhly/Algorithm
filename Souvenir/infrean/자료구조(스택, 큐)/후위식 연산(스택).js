/*
    후위식 연산(postfix)
    후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
    만약 3*(5+2)-9를 후위연산식으로 표현하면 352+*9-로 표현되며 그 결과는 12입니다.
*/
const str = "352+*9-";

const soulution = (str) => {
  let stack = [];

  for (const x of str) {
    if (!isNaN(x)) {
      stack.push(Number(x));
    } else {
      let num2 = stack.pop();
      let num1 = stack.pop();
      if (x === "+") stack.push(num1 + num2);
      else if (x === "-") stack.push(num1 - num2);
      else if (x === "*") stack.push(num1 * num2);
      else stack.push(num1 / num2);
    }
  }
  return stack[0];
};

console.log(soulution(str));
