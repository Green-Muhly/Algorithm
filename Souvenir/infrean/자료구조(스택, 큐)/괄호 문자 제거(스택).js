/*
    괄호 문자 제거
    입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 
    프로그램을 작성하세요.
*/
const str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";

const soulution = (str) => {
    let answer = "";
    let stack = [];

    for (const x of str) {
        if (x === ")") {
            while (stack.pop() !== "(");
        } else {
            stack.push(x);
        }
    }
    return stack.join("");
};

console.log(soulution(str));
