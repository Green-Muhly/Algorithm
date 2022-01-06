import sys
from itertools import combinations

input = sys.stdin.readline

n = int(input())
max_one = []
for _ in range(n):
    card = list(map(int, input().split()))
    comb = list(combinations(card, 3))
    max_tmp = -1
    for c in comb:
        max_tmp = max(max_tmp, sum(c) % 10)
    max_one.append(max_tmp)
for i in range(n - 1, -1, -1):
    if max_one[i] == max(max_one):
        print(i+1)
        break
