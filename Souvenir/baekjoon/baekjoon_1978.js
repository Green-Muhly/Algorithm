/*
  소수 찾기(실버 4)
  주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
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
    const input_array = input[1].split(" ").map(Number);
    let count = 0;
    input_array.map((item) => {
        if (isPrime(item)) count++;
    });

    console.log(count);
});

function isPrime(num) {
    if (num === 1) return false;
    for (let i = 2; i < num; i++) {
        if (num % i === 0) return false;
    }
    return true;
}
