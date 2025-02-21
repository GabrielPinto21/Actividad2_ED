package modelo;

public class Complemento {

    public int[] complemento(int universal[], int x[]) {
        int tamano = universal.length;
        for (int i = 0; i < universal.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (universal[i] == x[j]) {
                    universal[i] = 0;
                    tamano--;
                    break;
                }

            }
        }

        int a[] = new int[tamano];
        tamano = 0;

        for (int i = 0; i < universal.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (universal[i] != 0) {
                    a[tamano] = universal[i];
                    tamano++;
                    break;
                }
            }
        }
        return a;
    }
}
