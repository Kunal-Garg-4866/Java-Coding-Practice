import java.util.Scanner;

public class Basics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ages[] =  new int[5];
        ages[0]=34;
        ages[1]=27;
        ages[2]=30;
        ages[3]=35;
        ages[4]=40;
        for(int i=0;i<5;i++){
            System.out.println("Age at index "+i+" is "+ages[i]);
        }

        System.out.println();
        // diffrent to print complete array its a each array method

        for(int age : ages){
            System.out.println(age);
        }
    System.out.println();
        // now by using while lop
        int i= 0;
        while (i<5){
            System.out.println(ages[i]);
            i++;
        }
        System.out.println();
        int sum = 0;

        for (int j=0;j< arr.lenght;j++){
            
                sum = sum + ages[j];

            
           

        }
         System.out.println(sum);
    }
}