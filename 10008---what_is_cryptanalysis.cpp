#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int t;
    cin >> t;
    cin.ignore();
    map<char, int> m;
    vector<pair<int, char>> v;
    while (t--) {
        string s;
        getline(cin, s);
        transform(s.begin(), s.end(), s.begin(), ::toupper);
        for (auto x: s) {
            if (x >= 'A' && x <= 'Z')
                m[x]++;
        }
    }
    for (auto x: m)
        v.push_back(make_pair(x.second, x.first));
    sort(v.begin(), v.end(), [](const pair<int, char>& l, const pair<int, char>& r){
        if (l.first != r.first)
            return l.first > r.first;
        return l.second < r.second;
    });
    for (auto x: v)
        cout << x.second << " " << x.first << endl;

    return 0;
}