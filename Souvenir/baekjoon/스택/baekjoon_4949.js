// 균형잡힌 세상 (실버4)

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
  if (input[time - 1] === ".") rl.close();
}).on("close", function () {
  input.pop();
  const open = ["(", "["];
  const close = [")", "]"];

  input.map((list) => {
    const stack = [];
    let result = "yes";
    list
      .trim()
      .split("")
      .map((item) => {
        if (open.includes(item)) {
          stack.push(item);
        } else if (close.includes(item)) {
          if (stack.pop() !== open[close.indexOf(item)]) {
            result = "no";
          }
        }
      });
    if (stack.length !== 0) {
      result = "no";
    }
    console.log(result);
  });
});
