/*
   뒤집은 소수
   n개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를
   출력하는 프로그램을 작성하세요. 예를들어 32를 뒤집으면 23이고, 23은 소수이다. 
   그러면 23을 출력한다. 단 910을 뒤집으면 19로 숫자화해야한다.
*/
const check_prime = (num) => {
  for (let i = 2; i < num; i++) {
    const result = num % i;
    if (result === 0) {
      return false;
    }
  }
  if (num === 1) {
    return false;
  }
  return true;
};

const arr = [32, 55, 62, 20, 250, 370, 200, 30, 100];
const soulution = (arr) => {
  let answer = [];
  for (let x of arr) {
    let num = parseInt(x.toString().split("").reverse().join(""));
    check_prime(num) ? answer.push(num) : null;
  }
  return answer;
};

console.log(soulution(arr));
