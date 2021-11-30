function solution(s) {
    var answer = [];
    let tmp = s;
    let count = 0;
    let count2 = 0;
    while (tmp.length > 0) {
        let length = tmp.length;
        tmp = tmp.replace(/0/gi, "");
        let length2 = tmp.length;
        count += length - length2;
        tmp = (length - length2).toString(2);
        console.log(length, length2, tmp);
        count2++;
        if (tmp === "1") break;
    }
    console.log(count, count2);
    return answer;
}
