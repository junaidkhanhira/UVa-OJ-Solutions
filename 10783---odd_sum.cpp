#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t, c = 1;
    cin >> t;
    while (t--) {
        int n1, n2;
        cin >> n1 >> n2;
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            if (i%2 != 0)
                sum += i;
        }
        cout << "Case " << c++ << ": " << sum << endl;
    }

    return 0;
}