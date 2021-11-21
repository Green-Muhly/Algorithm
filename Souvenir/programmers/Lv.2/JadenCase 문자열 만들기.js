function solution(s) {
  let tempArr = s.split(" ");
  tempArr.map((str, idx) => {
    tempArr[idx] = str
      .split("")
      .map((txt, idx) =>
        isNaN(txt) ? (idx === 0 ? txt.toUpperCase() : txt.toLowerCase()) : txt
      )
      .join("");
  });

  return tempArr.join(" ");
}
