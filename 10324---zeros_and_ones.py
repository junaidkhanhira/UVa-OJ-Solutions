def main():
    c = 1
    while True:
        try:
            s = str(input())
            t = int(input())
            print('Case %d:' % c)
            for _ in range(t):
                i, j = map(int, input().split())
                mn = min(i, j)
                mx = max(i, j)
                ss = s[mn:mx+1]
                if ss == len(ss) * ss[0]:
                    print('Yes')
                else:
                    print('No')
            c += 1
        except EOFError:
            break


if __name__ == '__main__':
    main()
