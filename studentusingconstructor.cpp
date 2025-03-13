#include<iostream>
using namespace std;

class Student {
private:
    string name;
    int rollNo;
    float marks;

public:

    Student(string n, int r, float m) {
        name = n;
        rollNo = r;
        marks = m;
    }
    
    void getdata() {
        cout << "Enter Name: ";
        cin >> name;
        cout << "Enter Roll Number: ";
        cin >> rollNo;
        cout << "Enter Marks: ";
        cin >> marks;
    }

    void putdata(){
        cout << "Student Name: " << name << endl;
        cout << "Roll Number: " << rollNo << endl;
        cout << "Marks: " << marks << endl;
    }
};

int main() {
    string studentName;
    int roll;
    float marks;
    
    cout << "Enter student details:" << endl;
    cout << "Enter Name: ";
    cin >> studentName;
    cout << "Enter Roll Number: ";
    cin >> roll;
    cout << "Enter Marks: ";
    cin >> marks;
    
    Student student1(studentName, roll, marks);
    
    //student1.putdata();

    student1.getdata();
    
    student1.putdata();
    
    return 0;
}
