#include <bits/stdc++.h>
using namespace std;

bool check(string &a, string &b, string &c){
    if (a[1] == b[1] && b[1] == c[1]){
        char d = a[0], e = b[0], f = c[0];
        
        if ((d + 2 == e + 1 && e + 1 == f) || (d + 2 == f + 1 && f + 1 == e) || (e + 2 == d + 1 && d + 1 == f) || (e + 2 == f + 1 && f + 1 == d) || (f + 2 == d + 1 && d + 1 == e) || (f + 2 == e + 1 && e + 1 == d)) return true;
    }
    return false;
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int t; 
    cin >> t;
    string a, b, c, d;
    
    for (int i = 0; i < t; i++) {
        cin >> a >> b >> c >> d;

        if ((a == b && b == c) || (a == b && b == d) || (a == c && c == d) || (b == c && c == d)) cout << ":)\n";
        else if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) cout << ":)\n";
        else if (check(a, b, c) || check(a, b, d) || check(a, c, d) || check(b, c, d)) cout << ":)\n";
        else cout << ":(\n";
    }
}