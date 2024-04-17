package DivideEtImpera;

public class Alg1 {
    public class Main {
        public static void main(String[] args) {
            int[] v = {5,30,2,9,8};
            int[] w = {10,5,30,2,9};

            System.out.println(func(v, w, 0, v.length-1));
        }

        static int func(int[] v, int[] w, int i, int f) {

            if(i>=f){
                if(i+1<v.length && v[i] == w[i+1])
                    return 1;
                else
                    return 0;
            }else{
                int m = (i+f)/2;
                int r1 = func(v, w, i, m);
                int r2 = func(v, w, m+1, f);

                return r1+r2;
            }
        }

    }
}
