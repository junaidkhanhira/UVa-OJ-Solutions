#include <bits/stdc++.h>
using namespace std;

#define MAX 999

int multiply(int x, int res[], int res_size) {
    int carry = 0;
    for (int i = 0; i < res_size; i++) {
        int prod = res[i]*x + carry;
        res[i] = prod%10;
        carry = prod/10;
    }
    while (carry) {
        res[res_size] = carry%10;
        carry /= 10;
        res_size++;
    }
    return res_size;
}

void factorial(int n) {
    int res[MAX];
    res[0] = 1;
    int res_size = 1;
    for (int i = 2; i <= n; i++)
        res_size = multiply(i, res, res_size);
    map<int, int> m;
    for (int i = 0; i < res_size; i++)
        m[res[i]]++;
    cout << n << "! --" << endl;
    for (int i = 0; i <= 9; i++) {
        cout << "   (" << i << ")";
        cout.width(5);
        cout << m[i];
        if (i == 4 || i == 9)
            cout << endl;
        else
            cout << " ";
    }
}

int main() {
    int n;
    while (cin >> n) {
        if (n == 0)
            break;
        factorial(n);
    }

    return 0;
}