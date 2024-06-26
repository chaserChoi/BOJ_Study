#include <bits/stdc++.h>
using namespace std;

string diceNumName[7] = {"", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
string sameDiceNumName[7] = {"", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh"};

int main(){
    int n;
    cin >> n;
    
    for(int i = 1; i <= n; i++){
        int a, b;
        cin >> a >> b;
        cout << "Case " << i << ": ";
        
        int small = min(a,b);
        int big = max(a,b);
        
        if(small == big){
            cout << sameDiceNumName[small] << '\n';
            continue;
        }
        if(small == 5 && big == 6) {
            cout << "Sheesh Beesh\n";
            continue;
        }
        cout << diceNumName[big] << ' ' << diceNumName[small] << '\n';
    }
}