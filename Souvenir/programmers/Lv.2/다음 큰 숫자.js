function solution(n) {
    let answer = 0;
    const bin = n.toString(2).match(/1/g).length;
    while (true) {
        if ((++n).toString(2).match(/1/g).length === bin) {
            answer = n;
            break;
        }
    }
    return answer;
}
