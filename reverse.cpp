#include<iostream>
using namespace std;
int main(){
    int n,rem,rev;
    cout<<"Enter any no:";
    cin>>n;
    while(n>0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    cout<<"Rverse no. is:"<<rev;
    return 0;
}
