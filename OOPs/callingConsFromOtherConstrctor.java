public class callingConsFromOtherConstrctor {
    public static void main(String[] args) {
        
    }
}

class Student{
    int rno;
    String name;
    float marks;

    //suppose we have an empty cons
    //and we ahve to call another constructor from the empty one we can use 
    // this() keyword

    //internally : new Student(18 , "Rahul" , 100.0f)
    Student(){
       this(18 , "Rahul" , 100.0f);
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