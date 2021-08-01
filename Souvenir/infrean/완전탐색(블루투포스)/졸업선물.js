/*
    졸업선물
    선생님은 올해 졸업하는 반 학생들에게 졸업선물을 주려고 한다.
    학생들에게 인터넷 쇼핑몰에서 각자 원하는 상품을 골라 그 상품의 가격과 배송비를 제출하라고 했다.
    선생님이 가지고 있는 예산은 한정되어 있다.
    현재 예산으로 최대 몇명의 학생에게 선물을 사줄 수 있는지 구하는 프로그램을 작성하세요.
    선생님은 상품 하나를 50% 할인해서 살 수 있는 쿠폰을 가지고 있다. 배송비는 할인에 포함되지 않는다.

    모든 경우를 다해보자. 모든 경우에 대한 생각을 넓힐 필요가 있음.


*/
const arr = [
  [6, 6],
  [2, 2],
  [4, 3],
  [4, 5],
  [10, 3],
];
const cost = 28;
const soulution = (arr, cost) => {
  let answer = 0;
  let n = arr.length;
  arr.sort((a, b) => a[0] + a[1] - (b[0] + b[1]));
  for (let i = 0; i < n; i++) {
    let money = cost - (arr[i][0] / 2 + arr[i][1]);
    let cnt = 1;
    for (let j = 0; j < n; j++) {
      if (i !== j && arr[j][0] + arr[j][1] > money) break;
      if (i !== j && arr[j][0] + arr[j][1] <= money) {
        money -= arr[j][0] + arr[j][1];
        cnt++;
      }
    }
    answer = Math.max(answer, cnt);
  }

  return answer;
};

console.log(soulution(arr, cost));
