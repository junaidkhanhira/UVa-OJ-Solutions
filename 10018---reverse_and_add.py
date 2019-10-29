def is_palindrome(s):
    l = len(s)
    i = 0
    j = l-1
    while i < j:
        if s[i] != s[j]:
            return False
        i += 1
        j -= 1
    return True


def main():
    n = int(input())
    while True:
        if n == 0:
            break
        n -= 1
        st = input()
        c = 0
        sm = int(st)
        while True:
            if is_palindrome(st):
                break
            t = ''.join(reversed(st))
            sm += int(t)
            st = str(sm)
            c += 1
        print(c, st)


if __name__ == '__main__':
    main()
