#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, sum = 0, c = 0;
        double avg;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
            sum += arr[i];
        }
        avg = (double)sum/(double)n;
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg)
                c++;
        }
        cout << fixed << setprecision(3) << (double)c/(double)n*100 << "%" << endl;
    }

    return 0;
}