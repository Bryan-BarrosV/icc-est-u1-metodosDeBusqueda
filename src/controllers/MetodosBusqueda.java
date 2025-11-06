package controllers;

import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo;
    private ShowConsole sConsole;

    public MetodosBusqueda() {
        this.arreglo = new int[]{10, 11, -2, 5, 6, 8, 15, 22};
        this.sConsole = new ShowConsole();

        sConsole.printArray(arreglo);

        // Buscar el 5
        int result1 = busquedaLineal(5);
        sConsole.printResult(result1, 5);

        // Buscar -2
        int result2 = busquedaLinealWhile(-2);
        sConsole.printResult(result2, -2);

        // Buscar 20
        Integer result3 = busquedaLinealObj(20);
        sConsole.printResult2(result3, 20);

        // Buscar 100
        int result4 = busquedaLineal(100);
        sConsole.printResult(result4, 100);

        // Buscar 10
        Integer result5 = busquedaLinealObj(10);
        sConsole.printResult2(result5, 10);
    }

    public int busquedaLinealWhile(int value) {
        int i = 0;
        while (i < arreglo.length) {
            if (arreglo[i] == value) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int busquedaLineal(int value) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public Integer busquedaLinealObj(int value) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == value) {
                return i;
            }
        }
        return null;
    }
}
