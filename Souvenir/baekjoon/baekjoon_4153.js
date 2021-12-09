// 4153 직각삼각형(브론즈 2)

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];
let time = 0;

function isTriangle(num1, num2, num3) {
    if (Math.pow(num1, 2) + Math.pow(num2, 2) === Math.pow(num3, 2)) {
        return "right";
    }
    return "wrong";
}

rl.on("line", function (line) {
    input.push(line);
    time++;
    if (input[time - 1] === "0 0 0") rl.close();
}).on("close", function () {
    input.pop();
    let numArr = input;
    numArr.map((num) => {
        let arr = num
            .split(" ")
            .map(Number)
            .sort((a, b) => a - b);
        console.log(isTriangle(arr[0], arr[1], arr[2]));
    });
});
