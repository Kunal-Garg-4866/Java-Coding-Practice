package OOPS;

public class Student {
        public  String name ;
          private int rno;
        double percentage;

    public Student( String name , int rno , double percentage){ // default constructor
        this.name = name;
        this.rno = rno;
        this.percentage = percentage;
    }
    

    public int getrno(){
      
        return rno;
    }
    public void setrno( int rno){
         // rno = rno; this is wrong because both rno are same
        this.rno = rno; // this.rno means the instance variable 
    }
}

