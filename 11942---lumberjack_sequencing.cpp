#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t;
    cin >> t;
    cout << "Lumberjacks:" << endl;
    while (t--) {
        int fl1 = 1, fl2 = 1;
        int arr[10];
        for (int i = 0; i < 10; i++)
            cin >> arr[i];

        int prev = arr[0];
        for (int i = 1; i < 10; i++) {
            int curr = arr[i];
            if (curr < prev) {
                fl1 = 0;
                break;
            }
            prev = curr;
        }

        prev = arr[9];
        for (int i = 9; i >= 0; i--) {
            int curr = arr[i];
            if (curr < prev) {
                fl2 = 0;
                break;
            }
            prev = curr;
        }

        if (fl1 || fl2)
            cout << "Ordered" << endl;
        else
            cout << "Unordered" << endl;
    }

    return 0;
}