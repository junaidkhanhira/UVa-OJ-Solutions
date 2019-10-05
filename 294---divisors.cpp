#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t;
    cin >> t;
    while (t--) {
        ll l, h;
        cin >> l >> h;
        ll cn = l, cm = 0;
        for (ll i = l; i <= h; i++) {
            int c = 0;
            for (ll j = 1; j*j <= i; j++) {
                if (i%j == 0) {
                    if (i/j == j)
                        c++;
                    else
                        c += 2;
                }
            }
            if (c > cm) {
                cm = c;
                cn = i;
            }
        }
        cout << "Between " << l << " and " << h << ", " << cn << " has a maximum of " << cm << " divisors." << endl;
    }

    return 0;
}