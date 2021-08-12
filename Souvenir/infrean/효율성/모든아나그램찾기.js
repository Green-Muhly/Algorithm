/*
    모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩 윈도우)
    S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
*/
const S = "bacaAacba";
const T = "abc";

const compareMaps = (map1, map2) => {
  if (map1.size !== map2.size) return false;
  for (let [key, val] of map1) {
    if (map2.has(key) && map2.get(key) === val) {
    } else {
      return false;
    }
  }
  return true;
};

const soulution = (S, T) => {
  let answer = 0;
  let tH = new Map();
  let sH = new Map();

  for (const x of T) {
    tH.has(x) ? tH.set(x, tH.get(x) + 1) : tH.set(x, 1);
  }
  let len = T.length - 1;
  for (let i = 0; i < len; i++) {
    sH.has(S[i]) ? sH.set(S[i], sH.get(S[i]) + 1) : sH.set(S[i], 1);
  }
  let left = 0;
  for (let right = len; right < S.length; right++) {
    sH.has(S[right])
      ? sH.set(S[right], sH.get(S[right]) + 1)
      : sH.set(S[right], 1);
    if (compareMaps(sH, tH)) {
      answer++;
    }
    sH.set(S[left], sH.get(S[left]) - 1);
    if (sH.get(S[left]) === 0) sH.delete(S[left]);
    left++;
  }

  return answer;
};

console.log(soulution(S, T));
