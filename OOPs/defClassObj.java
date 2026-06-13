public class defClassObj {
    public static void main(String[] args) {
        // creation of object 
        // w the help of new keyword , new is used to dynamically allocate the vlaue
        Sample s1 = new Sample(); 
        s1.name="ayush";
        s1.no = 7999;

        //accessing the feilds of object and class 
        System.out.println(s1.name);
    }
}

// defining class 

// the class is defined w 2 properties name and no
// name is String type so when no intansilisz3ed it points to null 
// while num is a primative data type so it will ahve a de3falu tvalue 0;
class Sample{
    String name ;
    int no;
}