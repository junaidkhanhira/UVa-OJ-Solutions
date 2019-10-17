#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t;
    cin >> t;
    string bl;
    getline(cin, bl);
    while (t--) {
        ll n;
        cin >> n;
        int a[n];
        int b[n];
        for (ll i = 0; i < n; i++) {
            cin >> a[i];
            cin >> b[i];
        }
        string res;
        int carry = 0;
        for (ll i = n-1; i >= 0; i--) {
            int s, r;
            s = a[i] + b[i] + carry;
            r = s%10;
            carry = s/10;
            res += (r + '0');
        }
        if (carry)
            res += (carry + '0');
        reverse(res.begin(), res.end());
        cout << res << endl;
        if (t)
            cout << endl;
        getline(cin, bl);
    }

    return 0;
}