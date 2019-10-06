#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        ll sum = 0;
        cin >> n;
        for (int i = 0; i < n; i++) {
            ll i1, i2, i3;
            cin >> i1 >> i2 >> i3;
            sum += (i1*i3);
        }
        cout << sum << endl;
    }

    return 0;
}