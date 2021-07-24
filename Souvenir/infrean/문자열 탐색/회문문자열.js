/*
    회문문자열
    앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다.
    문자열이 입력되면 해당 문자열이 회문 문자열이며 'YES',  회문 문자열이 아니면 'NO'를 출력한다.
    단 회문문자열은 대소문자를 구분하지 않는다.
*/

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", function (line) {
    rl.close();
}).on("close", function () {
    let str = "goooG".toUpperCase().split("");
    let answer = true;
    let answer2 = true;

    for (let i = 0; i < Math.floor(str.length / 2); i++) {
        if (str[i] === str[str.length - i - 1]) {
        } else {
            answer = false;
            break;
        }
    }

    let str2 = "goooG".toUpperCase();
    if (str2.split("").reverse().join("") !== str2) answer2 = false;

    console.log(answer2 ? "YES" : "NO");
    process.exit();
});
