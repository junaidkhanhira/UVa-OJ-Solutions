#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, sum = 0;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++)
            cin >> arr[i];
        sort(arr, arr+n);
        int mid = n/2;
        for (int i = 0; i < n; i++) {
            if (i < mid)
                sum += (arr[mid] - arr[i]);
            else
                sum += (arr[i] - arr[mid]);
        }
        cout << sum << endl;
    }

    return 0;
}