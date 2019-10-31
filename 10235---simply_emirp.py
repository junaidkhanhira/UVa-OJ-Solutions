def is_palindrome(s):
    s = str(s)
    l = len(s)
    i = 0
    j = l-1
    while i < j:
        if s[i] != s[j]:
            return False
        i += 1
        j -= 1
    return True


def sieve():
    n = 1000002
    p = [True for i in range(n)]
    i = 2
    while i*i < n:
        if p[i]:
            for j in range(i*i, n, i):
                p[j] = False
        i += 1
    return p


def main():
    p = sieve()
    while True:
        try:
            n = int(input())
            if p[n]:
                t = str(n)
                t = ''.join(reversed(t))
                t = int(t)
                if p[t] and not is_palindrome(t):
                    print('%d is emirp.' % n)
                else:
                    print('%d is prime.' % n)
            else:
                print('%d is not prime.' % n)
        except EOFError:
            break


if __name__ == '__main__':
    main()
