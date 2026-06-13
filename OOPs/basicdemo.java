public class basicdemo{

    public static void main(String args[]){

    //creating new class object 
    Student s1 = new Student(); 

    System.out.println(s1.rno); // gives 0
    System.out.println(s1.name); // gives null (as String is a class itself so 
    // unless initialized it points to null and have null value.)
    System.out.println(s1.marks); // gives 0.0 

    s1.name = "Ayush";
    System.out.println(s1.rno);
    System.out.println(s1.name);
    System.out.println(s1.marks);

    Student s2 = new Student(17 , "Ayush" , 92.7f); // using the constructor 
    Student s3 = new Student();

    System.out.println(s2.name);
    System.out.println(s3.name);

    s3.name = "rahul";
    System.out.println(s3.name);
    }

}



    //defination of the class 
    //class is nothing but the named collection of properties 
    //classes have variables , methords 
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this.rno = 17;
        this.name = "kunal";
        this.marks = 80.0f;
    }

    // calling construcoter from another constructor

    //Student(){
    //  this(18 , "Rahul" , 100.0f);
    //}

    Student(int rno , String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}

// student() , student(...) , student(Student Other)
// all these are the example of constructor 
//this keyword is same as self keyword in python
// and this is example of constructor overloading.