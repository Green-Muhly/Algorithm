function solution(s) {
  var answer = true;
  let stack = [];

  if (s[0] === ")") return false;

  for (const x of s) {
    if (x === ")") {
      if (stack[stack.length - 1] === "(") {
        stack.pop();
      } else {
        stack.push(x);
      }
    } else {
      stack.push(x);
    }
  }
  return stack.length === 0 ? true : false;
}

// 다른사람 풀이

function solution(s) {
  let cum = 0;
  for (let paren of s) {
    cum += paren === "(" ? 1 : -1;
    if (cum < 0) {
      return false;
    }
  }
  return cum === 0 ? true : false;
}
