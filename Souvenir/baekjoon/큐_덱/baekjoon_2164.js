// 카드2 (실버4)

// const readline = require("readline");

// const rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout,
// });

// let input = [];
// let time = 0;

// rl.on("line", function (line) {
//   input.push(line);
//   time++;
//   if (input.length === 1) rl.close();
// }).on("close", function () {
//   const n = parseInt(input[0]);

//   const arr = Array.from({ length: n }, (v, i) => i + 1);
//   while (arr.length > 1) {
//     arr.shift();
//     const topNum = arr.shift();
//     arr.push(topNum);
//   }
//   console.log(...arr);
// });

//

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
    this.prev = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
    this._size = 0;
  }

  add(value) {
    const newNode = new Node(value);

    if (!this.head) {
      this.head = newNode;
    } else {
      this.tail.next = newNode;
      newNode.prev = this.tail;
    }

    this.tail = newNode;
    this._size++;

    return newNode;
  }
  getHead() {
    return this.head.value;
  }
  removeHead() {
    this.head = this.head.next;
    this.head.prev = null;
    this._size--;
  }
  getSize() {
    return this._size;
  }
}

rl.on("line", function (line) {
  input.push(line);
  if (input.length === 1) rl.close();
}).on("close", function () {
  const n = parseInt(input[0]);

  const card = new LinkedList();
  for (let i = 1; i <= n; i++) {
    card.add(i);
  }

  while (card.getSize() !== 1) {
    card.removeHead();
    card.add(card.getHead());
    card.removeHead();
  }

  console.log(card.getHead());
});
