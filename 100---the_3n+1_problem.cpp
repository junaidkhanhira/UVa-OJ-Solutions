#include <bits/stdc++.h>
using namespace std;

#define ll long long

int cycleLength(ll n) {
    int c = 1;
    while (n != 1) {
        if (n%2 != 0)
            n = (3*n + 1);
        else
            n /= 2;
        c++;
    }
    return c;
}

int main() {
    ll i, j;
    while (cin >> i >> j) {
        ll l, h, c, cm = 0;
        if (i < j) {
            l = i;
            h = j;
        } else {
            l = j;
            h = i;
        }
        for (ll n = l; n <= h; n++) {
            c = cycleLength(n);
            if (c > cm )
                cm = c;
        }
        cout << i << " " << j << " " << cm << endl;
    }

    return 0;
}