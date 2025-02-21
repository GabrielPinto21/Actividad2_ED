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

        c.complemento(universal, x);
        stopWatch.stop();
        System.out.println("Tiempo de ejecución: " + stopWatch.getDuration() + " ms");
    }
}
