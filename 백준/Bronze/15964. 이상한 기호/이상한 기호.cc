#include <iostream>
using namespace std;

long long new_arithmetic(long long a, long long b) {
    return (a + b) * (a - b);
}

int main() {
    long long a, b;
    scanf("%lld %lld", &a, &b);
    printf("%lld", new_arithmetic(a, b));
    return 0;
}