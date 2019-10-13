#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    ll b, s, c = 1;
    while (cin >> b >> s) {
        if (b == 0 && s == 0)
            break;
        if (b == 1)
            cout << "Case " << c++ << ": " << ":-\\" << endl;
        else if (s > b || b == s)
            cout << "Case " << c++ << ": " << ":-|" << endl;
        else
            cout << "Case " << c++ << ": " << ":-(" << endl;
    }

    return 0;
}