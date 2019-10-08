#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t, cnt = 1;
    cin >> t;
    while (t--) {
        double c, f, r;
        cin >> c >> f;
        f += (9.0/5.0)*c + 32;
        r = (5.0/9.0)*(f-32);
        cout << "Case " << cnt++ << ": " << fixed << setprecision(2) << r << endl;
    }

    return 0;
}