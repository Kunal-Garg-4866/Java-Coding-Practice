package OOPS;

public class StudendClass {
    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }
     
    public static void main(String[] args) {

    // Student  s1= new Student (); 
    // s1.name="Alice";
    // s1.percentage=89.5;
    // // s1.rno = 76;
    // s1.setrno(76); // setter method to access private variable
    // fun(s1);
    // System.out.println(s1.getrno());// getter method to access private variable


//  // contructor 
//         Student s1 = new Student ("Alice",76,89.5);
//         System.out.println(s1.name);
//         System.out.println(s1.getrno());
//         System.out.println(s1.percentage);
            Student s1 = new Student ("Bob", 45, 92.3);
            System.out.println(Student.numberofStudent); 
            Student s2 = new Student ("Bob", 45, 92.3);
            System.out.println(s2.numberofStudent);
            Student s3 = new Student ("Bob", 45, 92.3);
            System.out.println(s3.numberofStudent);

      
    }   
    
}
