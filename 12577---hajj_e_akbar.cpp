#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    string s;
    int c = 1;
    while (cin >> s) {
        if (s == "*")
            break;
        if (s == "Hajj")
            cout << "Case " << c++ << ": " << "Hajj-e-Akbar" << endl;
        else
            cout << "Case " << c++ << ": " << "Hajj-e-Asghar" << endl;
    }

    return 0;
}