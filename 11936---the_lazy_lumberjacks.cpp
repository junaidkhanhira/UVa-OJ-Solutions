#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t;
    cin >> t;
    while (t--) {
        int arr[3];
        cin >> arr[0] >> arr[1] >> arr[2];
        sort(arr, arr+3);
        if (arr[0]+arr[1] > arr[2])
            cout << "OK" << endl;
        else
            cout << "Wrong!!" << endl;
    }

    return 0;
}