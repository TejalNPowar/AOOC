#include<iostream>
using namespace std;
int main(){
	int i,j,sum=0;
	cout<<"Enter first no. and a no. upto:";
	cin>>i>>j;
	for(int k=i;k<=j;k++){
		sum=sum+k;	
	}
	cout<<"Addition of no.s from "<<i<<" to "<<j<<" is :"<<sum;
	return 0;
}
