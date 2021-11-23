function solution(s) {
  let tmp = s.split(" ").map((str) => parseInt(str));

  return `${Math.min(...tmp)} ${Math.max(...tmp)}`;
}
