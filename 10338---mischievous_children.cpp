#include <bits/stdc++.h>
using namespace std;

#define ull unsigned long long

ull factorial(int n) {
    if (n == 0)
        return 1;
    return n * factorial(n-1);
}

int main() {
    int t, n = 21, c = 1;
    ull fact[n];
    for (int i = 0; i < n; i++)
        fact[i] = factorial(i);
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        map<char, int> m;
        for (auto x: s)
            m[x]++;
        ull d = 1;
        for (auto x: m)
            d *= fact[x.second];
        ull res = fact[s.length()] / d;
        cout << "Data set " << c++ << ": " << res << endl;

    }

    return 0;
}