#include<iostream>
using namespace std;
class employee{
	public:
		int empid;
		char name[30];
		float salary;
		
	public:
		int getinfo(){
			cout<<"Enter ID:";
			cin>>empid;
			cout<<"Enter name:";
			cin>>name;
			cout<<"Enter salary:";
			cin>>salary;
		}
		int displayinfo(){
			cout<<"Id:"<<empid<<endl;
			cout<<"Name:"<<name<<endl;
			cout<<"Salary:"<<salary<<endl;
		}
};
int main(){
	employee emp;
	emp.getinfo();
	emp.displayinfo();
	return 0;
}
