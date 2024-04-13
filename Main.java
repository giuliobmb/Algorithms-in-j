import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] v = {6,30,2,9,8};
        int[] w = {10,6,30,2,9};

        v = merge_sort(w, 0, v.length-1);

        System.out.println(Arrays.toString(v));
    }

    static int[] merge_sort(int[] v, int i, int f) {
        int m = (i+f)/2;
        if(i==f){
            return new int[]{v[i]};
        }else{
            int[] ar1 = merge_sort(v, i, m);
            int[] ar2 = merge_sort(v, m+1, f);

            return merge(ar1, ar2);
        }

    }

    static int[] merge(int[] ar1, int[] ar2){
        int[] merged = new int[ar1.length+ar2.length];
        for (int i = 0, j=0, k=0; i < ar1.length+ar2.length; i++) {
            if(j>= ar1.length){
                merged[i] = ar2[k];
                k++;
            }else if(k >= ar2.length){
                merged[i] = ar1[j];
                j++;
            }else if(ar1[j] < ar2[k]){
                merged[i] = ar1[j];
                j++;
            }else{
                merged[i] = ar2[k];
                k++;
            }

        }
        return merged;
    }

}