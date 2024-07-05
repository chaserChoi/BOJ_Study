#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

struct Student {
    string name;
    int kor, eng, math;
};

bool cmp(const Student &a, const Student &b) {
    if (a.kor != b.kor) return a.kor > b.kor;
    if (a.eng != b.eng) return a.eng < b.eng;
    if (a.math != b.math) return a.math > b.math;
    return a.name < b.name;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;

    vector<Student> stu(N);
    for (int i = 0; i < N; i++)
        cin >> stu[i].name >> stu[i].kor >> stu[i].eng >> stu[i].math;

    sort(stu.begin(), stu.end(), cmp);

    for (const auto& s : stu)
        cout << s.name << '\n';

    return 0;
}