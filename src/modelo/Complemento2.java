package modelo;

public class Complemento2 {

     public Object[] complemento(Object universal[], Object x[]) {
          
          int tamano = universal.length;
          for (int i = 0; i < universal.length; i++) {
               if (universal[i] != null) {
                    for (int j = 0; j < x.length; j++) {
                         if (x[j] != null) {
                              if (universal[i].equals(x[j])) {
                                   universal[i] = null;
                                   tamano--;
                                   break;
                              }
                         }
                    }
               }
          }
          
          Object a[] = new Object[tamano];
          tamano = 0;

          for (int i = 0; i < universal.length; i++) {
               if (universal[i] != null) {
                    a[tamano] = universal[i];
                    tamano++;
               }
          }
          return a;
     }
}
