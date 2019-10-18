#include <bits/stdc++.h>
using namespace std;

int main() {
    double r, s;
    while (cin >> r >> s) {
        double a, segmentA, circleA, polygonA;
        a = 360/s;
        segmentA = (((a*M_PI)/360 - sin(a*M_PI/180)/2)*r*r)*s;
        circleA = M_PI*r*r;
        polygonA = circleA - segmentA;
        cout << fixed << setprecision(3) << polygonA << endl;
    }

    return 0;
}