#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t;
    cin >> t;
    while (t--) {
        ll i, j;
        cin >> i >> j;
        if (i == j)
            cout << "=" << endl;
        else if (i > j)
            cout << ">" << endl;
        else
            cout << "<" << endl;
    }

    return 0;
}