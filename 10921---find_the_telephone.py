def main():
    while True:
        try:
            s = input()
            r = ''
            for i in range(len(s)):
                if 'A' <= s[i] <= 'Z':
                    if 'A' <= s[i] <= 'C':
                        r += '2'
                    elif 'D' <= s[i] <= 'F':
                        r += '3'
                    elif 'G' <= s[i] <= 'I':
                        r += '4'
                    elif 'J' <= s[i] <= 'L':
                        r += '5'
                    elif 'M' <= s[i] <= 'O':
                        r += '6'
                    elif 'P' <= s[i] <= 'S':
                        r += '7'
                    elif 'T' <= s[i] <= 'V':
                        r += '8'
                    elif 'W' <= s[i] <= 'Z':
                        r += '9'
                else:
                    r += s[i]
            print(r)
        except EOFError:
            break


if __name__ == '__main__':
    main()
