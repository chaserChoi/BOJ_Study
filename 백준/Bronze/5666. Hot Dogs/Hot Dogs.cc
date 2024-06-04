#include <iostream>
using namespace std;

int main() {
    int h, p;
    
    while (scanf("%d %d",&h,&p) != EOF)
    {
        double ans = (double)h / (double)p;
        printf("%.2f\n",ans);
    }
}