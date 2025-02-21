package vista;

import org.apache.commons.lang3.time.StopWatch;

import modelo.Complemento;

public class Test {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Complemento c = new Complemento();

        int universal[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int x[] = { 1, 2, 3, 4, 5 };

        int[] result = c.complemento(universal, x);

        stopWatch.stop();

        System.out.println("El arreglo es: " + printArray(result));
        System.out.println("Tiempo de ejecución: " + stopWatch.getDuration() + " ms");
    }

    public static String printArray(int[] array) {
        String value = "[";
        for (int i = 0; i < array.length; i++) {
            value += array[i];
            if (i < array.length - 1) {
                value += (", ");
            }
        }
        value += "]";
        return value;
    }
}
