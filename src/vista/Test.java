package vista;

import org.apache.commons.lang3.time.StopWatch;

import modelo.Complemento;

public class Test {
    public static void main(String[] args) {

        System.out.println(instance1());

        System.out.println(instance2());

        System.out.println(instance3());

    }

    /**
     * Donde validamos que el complemento de los números pares del 1 al 100 es el
     * conjunto de los números impares del 1 al 100
     * 
     * @return 1, 3, 5, 7...99
     */
    private static String instance1() {

        StopWatch stopWatch = new StopWatch();

        Object from1To100[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
                24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73,
                74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98,
                99, 100 };
        Object evenNumbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44,
                46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94,
                96, 98, 100 };

        Complemento c = new Complemento();

        stopWatch.start();

        Object[] instancia1 = c.complemento(from1To100, evenNumbers);

        stopWatch.stop();

        String result1 = "La instancia 1 tiene complemento -> "
                + printArray(instancia1)
                + "\n\tTiempo de ejecución: "
                + stopWatch.getDuration()
                + "\n";

        return result1;
    }

    /**
     * Donde valimados que dentro de los números del 1 al 100, el complemento de un
     * conjunto de tipo (X ∈ E, -10≥ X ≤ 10)
     * 
     * @return Un String con el resultado esperado: 11, 12, 13...100
     */
    private static String instance2() {

        StopWatch stopWatch = new StopWatch();

        Object alfabet[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
                24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73,
                74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98,
                99, 100 };
        Object vocals[] = { -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Complemento c = new Complemento();

        stopWatch.start();

        Object[] instancia1 = c.complemento(alfabet, vocals);

        stopWatch.stop();

        String result1 = "La instancia 2 tiene complemento -> "
                + printArray(instancia1)
                + "\n\tTiempo de ejecución: "
                + stopWatch.getDuration()
                + "\n";

        return result1;
    }

    /**
     * Donde validamos que el complemento de un conjunto vacío es el conjunto
     * universal
     * 
     * @return Un String con el resultado esperado: 1, 2, 3, 4 ...100
     */
    private static String instance3() {

        StopWatch stopWatch = new StopWatch();

        Object universal[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
                24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73,
                74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98,
                99, 100 };
        Object empty[] = {};

        Complemento c = new Complemento();

        stopWatch.start();

        Object[] instancia1 = c.complemento(universal, empty);

        stopWatch.stop();

        String result1 = "La instancia 3 tiene complemento -> "
                + printArray(instancia1)
                + "\n\tTiempo de ejecución: "
                + stopWatch.getDuration()
                + "\n";

        return result1;
    }

    /**
     * This method is used to print the content of the array
     * 
     * @param array The array to print
     * @return A String secuence with the content of the array
     */
    public static String printArray(Object[] array) {
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
