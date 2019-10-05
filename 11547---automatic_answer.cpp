#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        ll res;
        cin >> n;
        res = n*567;
        res /= 9;
        res += 7492;
        res *= 235;
        res /= 47;
        res -= 498;
        res %= 100;
        res /= 10;
        if (res < 0)
            cout << res*-1 << endl;
        else
            cout << res << endl;
    }

    return 0;
}