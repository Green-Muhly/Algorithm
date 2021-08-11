/*
    아나그램(해쉬)
    아나그램이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
    예를들면 AbaAeCe와 baeeACA는 알파벳의 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
    알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재배열하면 상대편의 단어가 될 수 있는 것을 아나그램이라고 합니다.
    길이가 같은 두개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요.
    아나그램이면 YES, 아니면 NO를 출력합니다.
*/
const str1 = "abaCC";
const str2 = "Caaab";
const str3 = "AbaAeCe";
const str4 = "baeeACA";

const soulution = (str1, str2) => {
  let answer = "Yes";

  // let sH1 = new Map();
  // let sH2 = new Map();

  // for (const x1 of str1) {
  //   sH1.has(x1) ? sH1.set(x1, sH1.get(x1) + 1) : sH1.set(x1, 1);
  // }
  // for (const x2 of str2) {
  //   sH2.has(x2) ? sH2.set(x2, sH2.get(x2) + 1) : sH2.set(x2, 1);
  // }

  // for (let [key, val] of sH1) {
  //   if (sH2.has(key) && sH2.get(key) === val) {
  //   } else {
  //     answer = "No";
  //     break;
  //   }
  // }
  // console.log(sH1, sH2);

  let sH1 = new Map();

  for (const x1 of str1) {
    sH1.has(x1) ? sH1.set(x1, sH1.get(x1) + 1) : sH1.set(x1, 1);
  }

  for (const x2 of str2) {
    if (!sH1.has(x2) || sH1.get(x2) === 0) {
      return "No";
    }
    sH1.set(x2, sH1.get(x2) - 1);
  }

  return answer;
};

console.log(soulution(str1, str2));
