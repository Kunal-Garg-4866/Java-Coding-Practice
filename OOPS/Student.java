package OOPS;

public class Student {
        public  String name ;
          private int rno;
        double percentage;
        static int numberofStudent; // static variable make complete diffrent box 

    public Student( String name , int rno , double percentage){ // default constructor
        this.name = name;
        this.rno = rno;
        this.percentage = percentage;
        numberofStudent++;
    }
    

    public int getrno(){
      
        return rno;
    }
    public void setrno( int rno){
         // rno = rno; this is wrong because both rno are same
        this.rno = rno; // this.rno means the instance variable 
    }
}

