package views;

import models.Persona;

public class ShowConsole {

    public ShowConsole(){}

    public void printArray(int[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }
        System.out.println();
    }

    public void printResult(int result, int value) {
        if (result == -1) {
            System.out.println("Error -> No se encontró el número " + value);
        } else {
            System.out.println("Se encontró el número {" + value + "} en la posición: " + result);
        }
    }

    public void printResult2(Integer result, int value) {
        if (result == null) {
            System.out.println("Error -> No se encontró el número " + value);
        } else {
            System.out.println("El número {" + value + "} se encontró en la posición: " + result);
        }
    }

    public void showPersonResult(Persona resultadoPersona, String name) {
        // if (resultadoPersona == null) {
        //     System.out.println("No se encontro la Persona con el nombre: " + name);
        // }else{
        //     System.out.println("Se encontro la persona con el nombre: "+ name);
        // }
        System.out.println(
            resultadoPersona != null ? "Se encontro a " + resultadoPersona : "No se encontro a una persona con el nommbre: "+ name
        );
    }

    public void showPersonResult(Persona resultadoPersona, int age) {
        // if (resultadoPersona == null ) {
        //     System.out.println("No se encontro la edad diferente de null" + age);
        // }else{
        //     System.out.println("Se encontro la edad  ");
        // }
        System.out.println(
            resultadoPersona != null ?"Se escribe a " + resultadoPersona :"No se encontro a un persona con el nombre " + age
        );

    }

    public void showPersonResult3(Persona resultadoPersona3, int i, boolean valorNombre) {
        System.out.println(
            resultadoPersona3 != null ?"El nombre buscado por valor es:  " + resultadoPersona3 :"No se encontro a un persona con el nombre " + i+ "A"
        );
    }
}