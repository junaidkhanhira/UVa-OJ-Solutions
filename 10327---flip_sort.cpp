#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
    int n;
    int nums[1000];
    while (cin >> n) {
    	int res = 0;
    	
        for (int i = 0; i < n; i++) cin >> nums[i];
        
        for (int i = 0; i < n; i++) {
        	for (int j = i; j < n; j++) {
        		if (nums[i] > nums[j]) res++;
        	}
        }
        
        cout << "Minimum exchange operations : " << res << endl;
    }

    return 0;
}