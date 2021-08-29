/*
    마구간 정하기
    N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습ㄴ디ㅏ.
    현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다.
    각 마구간에는 한마리의 말만 넣을 수 있고, 가장 가까운 두 말의 거리가 최대가 되게 마을
    마구간에 배치하고 싶습니다.
    C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대 값을
    출력하는 프로그램을 작성하세요.
*/
const arr = [1, 2, 8, 4, 9];
const C = 3;

const count = (arr, mid) => {
  let cnt = 1,
    ep = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] - ep >= mid) {
      cnt++;
      ep = arr[i];
    }
  }
  return cnt;
};

const soulution = (arr, C) => {
  let answer = 0;
  arr.sort((a, b) => a - b);
  let lt = 1;
  let rt = arr[arr.length - 1];

  while (lt <= rt) {
    let mid = parseInt((rt + lt) / 2);
    if (count(arr, mid) >= C) {
      answer = mid;
      lt = mid + 1;
    } else {
      rt = mid - 1;
    }
  }

  return answer;
};

console.log(soulution(arr, C));
