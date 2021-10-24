function isPrime(num) {
  for (let i = 2; num > i; i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return num > 1;
}

function solution(nums) {
  var answer = 0;

  function D(L, s, sum) {
    if (L === 3) {
      if (isPrime(sum)) answer++;
    } else {
      for (let i = s; i < nums.length; i++) {
        D(L + 1, i + 1, sum + nums[i]);
      }
    }
  }
  D(0, 0, 0);

  return answer;
}
