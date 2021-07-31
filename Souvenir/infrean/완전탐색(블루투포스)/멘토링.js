/*
    멘토링
    현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 한다. 멘토링은
    멘토와 멘티가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것이다.
    선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정한다.
    만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서
    모두 B학생보다 등수가 앞서야 한다.
    M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇가지 인지 출력하는 프로그램을 작성하세요.
*/

const soulution = (arr) => {
  let answer = 0;
  let m = arr.length;
  let n = arr[0].length;
  for (let i = 1; i <= n; i++) {
    for (let j = 1; j <= n; j++) {
      let cnt = 0;
      for (let k = 0; k < m; k++) {
        let pi = 0;
        let pj = 0;
        for (let s = 0; s < n; s++) {
          if (arr[k][s] === i) pi = s;
          if (arr[k][s] === j) pj = s;
        }
        if (pi < pj) cnt++;
      }
      if (cnt === m) {
        answer++;
      }
    }
  }

  return answer;
};
let stu = [
  [3, 4, 1, 2],
  [4, 3, 2, 1],
  [3, 1, 4, 2],
];
console.log(soulution(stu));
