/*
    N개의 정수를 입력받아 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    (첫번째 수는 무조건 출력한다)

    입력 설명
    첫 줄에 자연수 N이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

    출력 설명
    자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
*/

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];
let time = 0;
rl.on("line", function (line) {
    input.push(line);
    time++;
    if (time === 2) rl.close();
}).on("close", function () {
    const inputNum = parseInt(input[0]);
    let inputArray = input[1].split(" ").map(Number);
    let result = [];
    result.push(inputArray[0]);
    for (let i = 1; i < inputNum; i++) {
        if (inputArray[i] > inputArray[i - 1]) {
            result.push(inputArray[i]);
        }
    }
    console.log(result);
    process.exit();
});
