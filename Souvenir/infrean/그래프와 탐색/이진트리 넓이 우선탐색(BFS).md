# 이진트리 넓이우선탐색(BFS)

- queue 사용
- 연결된 노드를 다 큐에 추가

## 상태트리

- 출발점에서 도착점으로 가는데 최단거리를 구할 때 사용
- 출발지점에서 한번만에 갈 수 있는 곳을 탐색 후 도착지점이 있는지 확인
- 없을때 다음 레벨 탐색(출발 지점에서 두번만에 갈 수 있는 곳을 탐색)

```js
function solution() {
  let answer = "";
  let queue = [];
  queue.push(1);
  while (queue.length) {
    let v = queue.shift();
    answer += `${v} `;
    for (let nv of [v * 2, v * 2 + 1]) {
      if (nv > 7) continue;
      queue.push(nv);
    }
  }

  return anwer;
}
```
