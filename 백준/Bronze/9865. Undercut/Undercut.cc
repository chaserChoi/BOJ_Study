#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n; 
    cin >> n;
    
    for (int i = 1; i <= n; i++) {
        int m; 
        cin >> m;
        int tessa = 0, danny = 0;
        
        while (m--) {
            int tessaCard, dannyCard; 
            cin >> tessaCard >> dannyCard;
            
            if (tessaCard == 1 && dannyCard == 2) 
                tessa += 6;
            else if (tessaCard == 2 && dannyCard == 1) 
                danny += 6;
            else if (dannyCard == tessaCard + 1) 
                tessa += tessaCard + dannyCard;
            else if (tessaCard == dannyCard + 1) 
                danny += tessaCard + dannyCard;
            else if (tessaCard > dannyCard) 
                tessa += tessaCard;
            else if (tessaCard < dannyCard) 
                danny += dannyCard;
        }    
        cout << "Game " << i << ": Tessa " << tessa << " Danny " << danny << "\n";
    }
    return 0;
}