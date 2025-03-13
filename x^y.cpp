#include<iostream>
using namespace std;
int main(){
	int x,y,result=1;
	cout<<"Enter a no.:"<<endl;
	cin>>x;
	cout<<"Enter the power:"<<endl;
	cin>>y;
	if(y==0){
		cout<<"invalid input";
	}
	else{
		for(int i=1;i<=y;i++){
			result=result*x;
		}	
	}
	cout<<"Power of "<<x<<" is:"<<result;
	return 0;
}
