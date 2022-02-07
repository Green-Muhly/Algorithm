// 괄호 (실버4)

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
  if (input.length === parseInt(input[0]) + 1) rl.close();
}).on("close", function () {
  input.shift();

  input.map((list) => {
    const stack = [];
    let result = "YES";
    list.split("").map((item) => {
      if (item === ")") {
        while (!stack.pop()) {
          result = "NO";
          break;
        }
      } else {
        stack.push(item);
      }
    });
    if (stack.length !== 0) {
      result = "NO";
    }
    console.log(result);
  });
});
