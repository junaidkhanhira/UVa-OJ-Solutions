#include <bits/stdc++.h>
using namespace std;

#define ll long long

void primeFactors(ll t) {
    ll n = t;
    vector<ll> v;
    bool isPos = true;
    if (n < 0) {
        n *= -1;
        isPos = false;
    }

    while (n%2 == 0) {
        v.push_back(2);
        n /= 2;
    }
    for (ll i = 3; i*i <= n; i+=2) {
        while (n%i == 0) {
            v.push_back(i);
            n /= i;
        }
    }
    if (n > 2)
        v.push_back(n);

    if (!isPos)
        cout << t << " = -1 x ";
    else
        cout << t << " = ";

    for (ll i = 0; i < v.size(); i++) {
        if (i == v.size()-1)
            cout << v[i];
        else
            cout << v[i] << " x ";
    }
    cout << endl;
}

int main() {
    ll n;
    while (cin >> n) {
        if (n == 0)
            break;
        primeFactors(n);
    }

    return 0;
}