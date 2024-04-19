package DivideEtImpera;

public class Alg4 {
    public static void main(String[] args) {
        int[] v = {2,2,5,5,5,5,5,5,5};
        System.out.println(func(v, 0, v.length-1));
        System.out.println(findTransitionIndexRecursive(v, 0, v.length-1));
    }
    public static int func(int[] v, int i, int f){
        if(i == f){
            if(i<v.length-1 && !(v[i+1]%2==0)){
                return i;
            }else{
                return 0;
            }
        }else{
            int m = (i+f)/2;
            if(v[m]%2==0){
                return func(v, m+1, f);
            }else{
                return func(v, i, m);
            }
        }
    }
    // CHATGPT VERSION
    public static int findTransitionIndexRecursive(int[] v, int left, int right) {
        // Controllo base della ricorsione
        if (left >= right) {
            // Se abbiamo raggiunto la condizione di convergenza, verifica se è dispari
            if (v[left] % 2 != 0) {
                return left;
            } else {
                return -1; // Non trovato
            }
        }

        int mid = left + (right - left) / 2;

        if (v[mid] % 2 == 0) {
            // Se l'elemento a mid è pari, la transizione deve essere nella metà destra
            return findTransitionIndexRecursive(v, mid + 1, right);
        } else {
            // Se l'elemento a mid è dispari, la transizione può essere a mid o prima di mid
            return findTransitionIndexRecursive(v, left, mid);
        }
    }

    public static int findTransition(int[] v) {
        // Controllo iniziale se l'array è vuoto o se l'ultimo elemento è ancora pari
        if (v.length == 0 || v[v.length - 1] % 2 == 0) {
            System.out.println("Nessuna transizione trovata.");
            return -1; // Ritorna -1 per indicare l'assenza di transizione
        }

        return findTransitionIndexRecursive(v, 0, v.length - 1);
    }


}
