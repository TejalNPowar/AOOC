#include<iostream>
using namespace std;
int main(){
	int a,b,c;
	cout<<"Enter three no.s:"<<endl;
	cin>>a>>b>>c;
	if(a>b){
		if(a>c){
			cout<<"a="<<a<<"is the greatest among entered three no.s."<<endl;
		}
		else{
			cout<<"c="<<c<<"is the greatest among entered three no.s."<<endl;
		}
	}
	else{
		if(b>c){
			cout<<"b="<<b<<"is the greatest among entered three no.s."<<endl;
		}
		else{
			cout<<"c="<<c<<"is the greatest among entered three no.s."<<endl;
		}
	}
}
