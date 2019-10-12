#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, c = 1;
    while (cin >> n) {
        if (n == 0)
            break;
        int t, r = 0;
        while (n--) {
            cin >> t;
            if (t == 0)
                r--;
            else
                r++;
        }
        cout << "Case " << c++ << ": " << r << endl;
    }

    return 0;
}