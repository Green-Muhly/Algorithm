/*
    올바른 괄호
    괄호가 입력되면 올바른 괄호이면 YES, 올바르지 않으면 NO를 출력합니다.
*/
const str = "()()(()))";

const soulution = (str) => {
    let answer = "YES";
    let stack = [];
    if (!str.length % 2) return "NO";

    for (const x of str) {
        if (x === "(") {
            stack.push(x);
        } else {
            if (stack.length === 0) return "NO";
            stack.pop();
        }
    }
    answer = stack.length === 0 ? "YES" : "NO";

    return answer;
};

console.log(soulution(str));
