/*
    가위바위보
    A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
    B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
    가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
    
    두 사람의 각 회의 가위,바위,보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.

    입력 설명
    첫 줄에 자연수 N이 주어지고,
    두번째 줄에 A가 낸 정보, 세번째 줄에 B가 낸 정보가 주어진다.

    출력 설명
    각 줄에 각 회의 승자를 출력한다.
*/
const funC = (a, b) => {
    switch (a) {
        case 1:
            if (b === 1) return "D";
            else if (b === 2) return "B";
            else return "A";
            break;
        case 2:
            if (b === 1) return "A";
            else if (b === 2) return "D";
            else return "B";
            break;
        case 3:
            if (b === 1) return "B";
            else if (b === 2) return "A";
            else return "D";
            break;
        default:
            break;
    }
};

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
    if (time === 3) rl.close();
}).on("close", function () {
    let inputA = input[1].split(" ").map(Number);
    let inputB = input[2].split(" ").map(Number);

    for (let i = 0; i < inputA.length; i++) {
        console.log(funC(inputA[i], inputB[i]));
    }
    process.exit();
});
