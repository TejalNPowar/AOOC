#include<iostream>
using namespace std;
int main(){
	int n,sum=0;
	cout<<"Enter the no of digit:";
	cin>>n;
	int ar[n];
	cout<<"Enter a no.:";
	for(int i=0;i<n;i++){
		cin>>ar[i];
	}
	for(int i=0;i<n;i++){
		sum+=ar[i];
	}
	cout<<"Addition of the digits of a no.:"<<sum<<endl;
	return 0;
}
