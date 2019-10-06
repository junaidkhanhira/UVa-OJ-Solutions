#include <bits/stdc++.h>
using namespace std;

#define ll long long

ll factorial(ll n) {
    if (n == 1)
        return 1;
    return n * factorial(n-1);
}

int main() {
    ll arr[14];
    arr[0] = 1;
    for (ll i = 1; i <= 13; i++)
        arr[i] = factorial(i);
    int n;
    while (cin >> n) {
        if (n < 0 && n%2 == 0)
            cout << "Underflow!" << endl;
        else if (n < 0 && n%2 != 0)
            cout << "Overflow!" << endl;
        else if (n < 8 && n >= 0)
            cout << "Underflow!" << endl;
        else if (n > 13 )
            cout << "Overflow!" << endl;
        else
            cout << arr[n] << endl;
    }


    return 0;
}