#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    freopen("input", "r", stdin);
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        if (s.length() == 3) {
            int oc = 0, tc = 0;
            if (s[0] == 'o') oc++;
            if (s[0] == 't') tc++;
            if (s[1] == 'n') oc++;
            if (s[1] == 'w') tc++;
            if (s[2] == 'e') oc++;
            if (s[3] == 'o') tc++;
            if (oc > tc)
                cout << 1 << endl;
            else
                cout << 2 << endl;
        } else
            cout << 3 << endl;
    }

    return 0;
}