package DivideEtImpera;

public class Alg2 {
    public static void main(String[] args) {
        int[] a = { 10, 20, 10, 10, 30, 10, 10, 10, 30, 20, 10, 10 };
        int v = 10;
        System.out.println(func(a, v, 0, a.length));
    }


    public static int func(int[] a, int v, int i, int f){
        if(i==f){
            if(i < a.length-1 && a[i] == v && a[i+1] == v){
                return 1;
            }else{
                return 0;
            }
        }else{
            int m = (i+f)/2;
            int r1 = func(a, v, i, m);
            int r2 = func(a, v, m+1, f);
            return r1+r2;
        }
    }
}
