#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, c = 1;
    cin >> t;
    while (t--) {
        bool isLeap = false;
        int d, m, y, qy, bd = 0;
        cin >> d >> m >> y >> qy;
        if (m == 2 && d == 29)
            isLeap = true;
        if (isLeap) {
            for (int i = y; i <= qy; i+=4) {
                if ((i%400 == 0) || (i%100 != 0 && i%4 == 0))
                    bd++;
            }
            bd--;
        } else {
            bd = qy - y;
        }
        cout << "Case " << c++ << ": " << bd << endl;
    }

    return 0;
}