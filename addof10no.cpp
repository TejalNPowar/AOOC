#include<iostream>
using namespace std;
int main(){
	int ar[10];
	cout<<"Enter 10 no.s:"<<endl;
	for(int i=0;i<10;i++){
		cin>>ar[i];
	}
	int sum=0;
	for(int i=ar[0];i<ar[i];i++){
		sum=sum+i;
	}
	cout<<"Addition of 10 entered no.s is:"<<sum;
	return 0;
}
