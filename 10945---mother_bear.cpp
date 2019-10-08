#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    string s;
    while (getline(cin, s)) {
        if (s == "DONE")
            break;
        transform(s.begin(), s.end(), s.begin(), ::tolower);
        string t;
        for (auto x: s) {
            if (x >= 'a' && x <= 'z')
                t += x;
        }
        int i = 0;
        int j = t.length()-1;
        int fl = 1;
        while (i < j) {
            if (t[i] != t[j]) {
                fl = 0;
                break;
            }
            i++;
            j--;
        }
        if (fl)
            cout << "You won't be eaten!" << endl;
        else
            cout << "Uh oh.." << endl;
    }

    return 0;
}