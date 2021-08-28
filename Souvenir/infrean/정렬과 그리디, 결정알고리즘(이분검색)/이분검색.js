/*
    이분검색
    임의의 N개의 숫자가 입력으로 주어진다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중
    한 개의 수 M이 주어지면 이분검색으로 M이 정렬된 상태에서 몇번째에 있는지 구하는 프로그램을 작성하세요.
*/
const arr = [23, 87, 65, 12, 57, 32, 99, 81];
const num = 32;

const soulution = (arr, num) => {
    arr.sort((a, b) => a - b);

    let start = 0;
    let end = arr.length - 1;
    let mid = Math.floor((end + start) / 2);

    while (end - start >= 0) {
        if (arr[mid] === num) return mid + 1;
        else if (arr[mid] <= num) start = mid + 1;
        else end = mid - 1;

        mid = Math.floor((end + start) / 2);
    }

    return mid + 1;
};

console.log(soulution(arr, num));
