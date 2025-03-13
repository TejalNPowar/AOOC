#include<iostream>
using namespace std;
int main(){
	int min,max,temp;
	int a[10];
	cout<<"Enter 10 no.:";
	for(int i=0;i<10;i++){
		cin>>a[i];
	}	
	for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	cout<<"Ascending order:"<<endl;
	for(int i=0;i<10;i++){
		cout<<a[i]<<" "<<endl;
	}
	cout<<"Min:"<<a[0]<<endl;
	cout<<"Max:"<<a[9]<<endl;
}
