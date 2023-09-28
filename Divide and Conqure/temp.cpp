#include<iostream>
#include<algorithm>
using namespace std;

int main () {
    string arr[5] = {"sun", "earth", "mars", "mercury", "venus"};
    sort(arr, arr + 5);
    for(int i = 0; i < 5; i++) cout << arr[i] << endl;
}