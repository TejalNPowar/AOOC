#include<iostream>
using namespace std;
int main(){
	int ar[10],temp;
	cout<<"Enter 10 no.s:"<<endl;
	for(int i=0;i<10;i++){
		cin>>ar[10];
	}
	for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			if(ar[i]>ar[j]){
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
			
		}
	}
	
	cout<<"Ascending order:"<<endl;
	for(int i=0;i<10;i++){
		cout<<ar[i];
	}
	
	return 0;
}
