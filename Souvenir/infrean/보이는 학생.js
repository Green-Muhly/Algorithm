/*
    보이는 학생
    선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로  서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
    맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
    (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않는다.)

    입력 설명
    첫 줄에 정수 N이 입력된다. 그 다음 줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다

    출력 설명
    선생님이 볼 수 있는 최대 학생수를 출력한다.
*/

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", function (line) {
    const inputArray = line.split(" ").map(Number);
    /*
        내가 푼 방법 O(n2)
        let result = 1;
        let count = 0;
        for (let i = 1; i < inputArray.length; i++) {
            for (let j = i - 1; j >= 0; j--) {
                if (inputArray[i] >= inputArray[j]) {
                    count++;
                    if (count === i) result++;
                } else {
                    break;
                }
            }
        }
    */
    let result = 1;
    let max = inputArray[0]; // 앞에 사람중 가장 큰 사람
    for (let i = 1; i < inputArray.length; i++) {
        if (inputArray[i] > max) {
            result++;
            max = inputArray[i];
        }
    }
    console.log(result);
    rl.close();
}).on("close", function () {
    process.exit();
});
