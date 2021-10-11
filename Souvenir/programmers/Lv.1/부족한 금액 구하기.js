function solution(price, money, count) {
  var answer = 0;
  let tmp = 1;
  while (tmp <= count) {
    answer += tmp * price;
    tmp++;
  }
  return answer > money ? answer - money : 0;
}
