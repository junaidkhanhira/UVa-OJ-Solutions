#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, c = 1;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        string arr[n+1];
        for (int i = 0; i <= n; i++)
            cin >> arr[i];
        string mpn = arr[n];
        cout << "Case " << c++ << ":" << endl;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                int temp = abs((int) arr[i][j] - (int) mpn[j]);
                if (temp > 0) cnt++;
                if (cnt > 1) break;
            }
            if (cnt <= 1)
                cout << arr[i] << endl;
        }
    }

    return 0;
}