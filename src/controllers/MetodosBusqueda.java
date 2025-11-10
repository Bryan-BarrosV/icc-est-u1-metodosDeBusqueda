package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo;
    private ShowConsole sConsole;

    public MetodosBusqueda() {
        this.arreglo = new int[] { 10, 11, -2, 5, 6, 8, 15, 22 };
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

    public Persona serchPersonByName(Persona[] personas, String name) {
        for (Persona persona : personas) {
            if (persona.getName().equals(name)) {
                return persona;
            }
        }
        return null;
    }

    public Persona findPersonaByAge(Persona[] personas, int age) {
        for (Persona persona : personas) {
            if (persona.getAge() > age && persona.getAge() % 2 != 0) {
                return persona;
            }
        }
        return null;
    }
    
    public Persona findPersonaByValueName(Persona[] personas, int valorBuscado) {
    for (Persona persona : personas) { 
        int valorAsciiTotal = 0;
        String nombre = persona.getName();

        for (int i = 0; i < nombre.length(); i++) {
            valorAsciiTotal += (int) nombre.charAt(i);
        }

        if (valorAsciiTotal == valorBuscado) {
            return persona; 
        }
    }
    return null; 
}


}
