// 다시 풀어보기 무조건!

function solution(dartResult) {
  let answer = [];
  //조건에 맞는 정규식 생성
  //숫자 무조건 1개이상, 문자 무조건 1개이상, #,* 0개이상
  const re = /(\d+[A-Z]+[#*]*)/g;
  //정규식에 조건에 맞는 배열 생성
  let dart = dartResult.match(re);

  let ans_index = 0;
  for (let d of dart) {
    //정규식을 이용해 숫자만 가져옴
    let tmp = d.match(/\d+/);
    tmp = parseInt(tmp[0]);
    //정규식을 이용해 문자만 가져옴
    let bonus = d.match(/[A-Z]+/);
    if (bonus[0] == "D") {
      tmp = tmp ** 2;
    } else if (bonus[0] == "T") {
      tmp = tmp ** 3;
    }

    if (d[d.length - 1] == "*") {
      tmp *= 2;
      //스타상일 경우 현재 index-1에 값이 있다면 전값도 2배 곱함
      if (answer[ans_index - 1]) {
        answer[ans_index - 1] = answer[ans_index - 1] * 2;
      }
    } else if (d[d.length - 1] == "#") {
      tmp *= -1;
    }
    answer.push(tmp);
    ans_index += 1;
  }
  //reduce함수 : 배열의 값을 누적하는 함수
  return answer.reduce((a, b) => a + b);
}

//
function solution(dartResult) {
  const bonus = { S: 1, D: 2, T: 3 },
    options = { "*": 2, "#": -1, undefined: 1 };

  let darts = dartResult.match(/\d.?\D/g);

  for (let i = 0; i < darts.length; i++) {
    let split = darts[i].match(/(^\d{1,})(S|D|T)(\*|#)?/),
      score = Math.pow(split[1], bonus[split[2]]) * options[split[3]];

    if (split[3] === "*" && darts[i - 1]) darts[i - 1] *= options["*"];

    darts[i] = score;
  }

  return darts.reduce((a, b) => a + b);
}
