#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    string s;
    while (cin >> s) {
        if (s == "0")
            break;
        int i = 0, p = s.length();
        ll res = 0;
        for (auto x: s) {
            res += ((s[i]-'0')*(pow(2, p) - 1));
            p--;
            i++;
        }
        cout << res << endl;
    }

    return 0;
}