package OOPS;

public class FractionClass {
    public static int gcd (int num, int dem){

        int min = Math.min(num,dem);
        for(int i=min;i>=1;i--){
            if(num%i==0 && dem%i==0) return i;

        }
        return min;
    }
    public static class Fraction{
        int num;
        int dem;
    public Fraction(int num , int dem){
        this.num = num;
        this.dem = dem;
        simplify();
    }
     public  void simplify(){
        // this method will simplify the fraction but not in all cases 
    //     if(num<dem){
    //         if(dem%num==0){
    //             dem = dem/num;
    //             num = 1;
    //         }
    //     }

    // now this method 
        int hcf = gcd(num,dem);
        num/= hcf;
        dem/= hcf;
    }

}
    public static void main(String[] args) {
         Fraction f1 = new Fraction(35,21);
        // f1.simplify();
         System.out.println(f1.num+"/"+f1.dem);

        
    }
    
}

