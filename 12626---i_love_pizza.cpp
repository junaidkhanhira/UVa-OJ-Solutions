#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int m = 1, a = 3, r = 2, g = 1, i = 1, t = 1;
    int mc = 0, ac = 0, rc = 0, gc = 0, ic = 0, tc = 0;
    int tcs;
    cin >> tcs;
    while (tcs--) {
        string s;
        cin >> s;
        map<char, int> mp;
        for (auto x: s)
            mp[x]++;
        mc = mp['M']/m;
        ac = mp['A']/a;
        rc = mp['R']/r;
        gc = mp['G']/g;
        ic = mp['I']/i;
        tc = mp['T']/t;
        int arr[6] = {mc, ac, rc, gc, ic, tc};
        int r = *min_element(arr+0, arr+6);
        cout << r << endl;
    }

    return 0;
}