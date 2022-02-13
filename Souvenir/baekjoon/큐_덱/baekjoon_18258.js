// 큐2 (실버4)

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
  const n = input.shift();
  const queue = [];
  let result = "";

  input.map((item) => {
    const [type, num] = item.split(" ");
    switch (type) {
      case "push":
        queue.push(parseInt(num));
        break;
      case "pop":
        const pop = queue.shift();
        if (pop) {
          result += `${pop}\n`;
        } else {
          result += `-1\n`;
        }
        break;
      case "size":
        result += `${queue.length}\n`;
        break;
      case "empty":
        if (queue.length === 0) result += `1\n`;
        else result += `0\n`;
        break;
      case "front":
        if (queue.length === 0) result += `-1\n`;
        else result += `${queue[0]}\n`;
        break;
      case "back":
        if (queue.length === 0) result += `-1\n`;
        else result += `${queue[queue.length - 1]}\n`;
        break;
      default:
        break;
    }
  });
  console.log(result);
});

// 클래스를 이용한 구현(다른사람 풀이)

const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const N = Number(input[0]);
const commands = input.slice(1);

class Node {
  prev = null;
  next = null;
  constructor(value) {
    this.value = value;
  }
}
class Queue {
  constructor() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }
  push(value) {
    const newNode = new Node(value);
    if (!this.head) this.head = newNode;
    if (this.tail) {
      this.tail.next = newNode;
      newNode.prev = this.tail;
    }
    this.tail = newNode;
    this.length += 1;
  }
  pop() {
    if (this.length === 0) return -1;
    const value = this.head.value;
    this.head = this.head.next;
    this.length -= 1;
    return value;
  }
  size() {
    return this.length;
  }
  empty() {
    return this.length === 0 ? 1 : 0;
  }
  front() {
    return this.length ? this.head.value : -1;
  }
  back() {
    return this.length ? this.tail.value : -1;
  }
}

const solution = (N, commands) => {
  const queue = new Queue();
  let answer = "";
  commands.forEach((c) => {
    const [command, value] = c.split(" ");
    if (command === "push") queue[command](value);
    else answer += queue[command]() + "\n";
  });

  return answer;
};

console.log(solution(N, commands));
