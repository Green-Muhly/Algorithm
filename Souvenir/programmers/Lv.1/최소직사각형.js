function solution(sizes) {
  var answer = 0;
  const newArr = sizes.map(([w, h]) => (w < h ? [h, w] : [w, h]));

  let maxW = 0;
  let maxH = 0;
  newArr.map(([w, h]) => {
    maxW = Math.max(maxW, w);
    maxH = Math.max(maxH, h);
  });
  answer = maxW * maxH;
  return answer;
}
