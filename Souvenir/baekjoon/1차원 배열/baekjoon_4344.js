// 평균은 넘겠지 Bronze1

// 입출력에 사용할 rl을 받아오는 함수
const getRl = () => {
  const readline = require("readline");
  return readline.createInterface({
    input: process.stdin,
    output: process.stdout,
  });
};
const rl = getRl();

const average = (arr) => {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum / arr.length;
};

// 주어진 입력들을 이용해서 정답을 반환하는 함수
const printAnswer = (inputs) => {
  inputs.shift();
  inputs.forEach((element) => {
    // console.log(element);
    let newArr = element.split(" ").map(Number);
    newArr.shift();
    const avg = average(newArr);
    let count = 0;
    newArr.map((x) => {
      if (x > avg) count++;
    });
    console.log(((count / newArr.length) * 100).toFixed(3) + "%");
  });
  //   console.log(inputs);
};

// 입력 받아와서 알고리즘 동작하는 함수
const inputs = [];
const start = (rl) => {
  rl.on("line", (line) => {
    inputs.push(line);
    if (inputs.length === parseInt(inputs[0]) + 1) rl.close();
  }).on("close", () => {
    printAnswer(inputs);
    // const input_array = input[1].split(" ").map(Number);
    process.exit();
  });
};

// 프로그램 동작
start(rl);
