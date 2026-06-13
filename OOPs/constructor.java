public class constructor { 
    public static void main(String[] args) {
        Student s1 = new Student(17 , "Ayush" , 92.7f);
        Student thor = new Student(s1);

        System.out.println(thor.name);
        System.out.println(thor.rno);
    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this.rno = 17;
        this.name = "kunal";
        this.marks = 80.0f;
    }

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
