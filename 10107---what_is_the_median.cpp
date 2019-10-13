#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, s = 0;
    int arr[10001];
    while (cin >> n) {
        arr[s] = n;
        sort(arr, arr+(s+1));
        if (s == 0)
            cout << n << endl;
        else {
            if (s%2 == 0)
                cout << arr[s/2] << endl;
            else {
                int t = s/2;
                cout << (arr[t]+arr[t+1])/2 << endl;
            }
        }
        s++;
    }

    return 0;
}