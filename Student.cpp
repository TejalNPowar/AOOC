#include<iostream>
using namespace std;
class student{
	private:
    int roll;
    string name;
    float marks;
	
	public:
		student(){
			roll=0;
			name="";
			marks=0;
		}
	int getdata(){
		cout<<"Enter roll no.:"<<endl;
	    cin>>roll;
	    cout<<"Enter name:"<<endl;
	    cin>>name;
	    cout<<"Enter marks:"<<endl;
	    cin>>marks;
	}
	int displaydata(){
		cout<<"Roll no.:"<<roll<<endl;
		cout<<"Name:"<<name<<endl;
		cout<<"Marks:"<<marks<<endl;
	}
    
};
int main(){
	//student stu;
//	stu.getdata();
//	stu.displaydata();
	
	student stu;
	stu.getdata();
	stu.displaydata();
}

