/*
    유효한 팰린드롬
    앞에서 읽을때나 뒤에서 읽을때나 같은 문자열을 팰린드롬이라고 한다.
    문자열이 입력되면 해당 문자열이 팰린드롬이면 YES 아니면 NO를 출력하는 프로그램을 작성하세요.
    회문을 검사할때는 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않는다.
    알파벳 이외의 문자들은 무시한다.
*/
const str = "found7, time: study; Yduts; emit, 7Dnuof";
const soulution = (str) => {
    let temp = str.replace(new RegExp("[(~!@#$%^&*()_+|;,<>?:{}),(0-9),( )]", "gi"), "").toUpperCase();
    // str.replace(/[^a-z]/g, '')
    return temp === temp.split("").reverse().join("") ? "YES" : "NO";
};

console.log(soulution(str));
