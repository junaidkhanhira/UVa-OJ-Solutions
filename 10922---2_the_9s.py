def main():
    while True:
        n = input()
        t = n
        if n == '0':
            break
        c = 0
        fl = False
        while True:
            c += 1
            sm = 0
            for i in range(len(t)):
                sm += int(t[i])
            t = str(sm)
            if len(t) <= 1:
                if t == '9':
                    fl = True
                break
        if fl:
            print('%s is a multiple of 9 and has 9-degree %d.' % (n, c))
        else:
            print('%s is not a multiple of 9.' % n)


if __name__ == '__main__':
    main()
