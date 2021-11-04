function solution(nums) {
  const answer = [...new Set(nums)];
  const max = nums.length / 2;

  return answer.length > max ? max : answer.length;
}
