
/**
 * Write a description of class tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tester
{
    public static void main() {
        int init;
        int add;
        String num = "";
        for (init = 1000; init<10000; init++) {
            if(isprime(init) ){
            for(add= 1; (init+(2*add))< 10000; add++) {
                if(isprime(init+add) && isprime(init+(2*add))) {
                    int a = init;
                    int b = init+add;
                    int c = init+(2*add);
                    if(isperm(a,b) && isperm (a,c)) {
                        num = "" + a + "+" + b + "+" + c;
                        System.out.println(num);
                    }
                }
            }
        }
    }
                
    }
    public static boolean isprime(int number) {
        int i = 0;
        if (number <= 1)
            return false;
        for (i = 2; i<number; i++) {
               if(number % i == 0 && i != number) {
                   return false;
               }
        }
        return true;
    }
    public static boolean isperm(int a, int b) {
        int[] array1 = new int[10];
        while(a>0) {
                 array1[a%10]++;
                 a = a/10;
        }
        while(b>0) {
            
                array1[b%10]--;
                b = b/10;
        }
        for(int k = 0; k < 10; k++) {
            if (array1[k] !=0) return false;
        }
        return true;
    }
}
