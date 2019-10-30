def main():
    t = int(input())
    cs = 1
    for _ in range(t):
        n, p, q = map(int, input().split())
        w = list(map(int, input().split()))
        c = 0
        sm = 0
        i = 0
        while c < p and i < n:
            sm += w[i]
            if sm > q:
                break
            c += 1
            i += 1
        print('Case %d: %d' % (cs, c))
        cs += 1


if __name__ == '__main__':
    main()
