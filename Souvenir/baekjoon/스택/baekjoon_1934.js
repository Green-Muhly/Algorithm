// 스택 (실버4)

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
  const stack = [];
  let result = "";
  input.map((item) => {
    const [type, num] = item.split(" ");
    switch (type) {
      case "push":
        stack.push(parseInt(num));
        break;
      case "pop":
        const pop = stack.pop();
        if (pop) {
          result += `${pop}\n`;
        } else {
          result += `-1\n`;
        }
        break;
      case "size":
        result += `${stack.length}\n`;
        break;
      case "empty":
        if (stack.length === 0) result += `1\n`;
        else result += `0\n`;
        break;
      case "top":
        if (stack.length === 0) result += `-1\n`;
        else result += `${stack[stack.length - 1]}\n`;
        break;
      default:
        break;
    }
  });
  console.log(result);
});
