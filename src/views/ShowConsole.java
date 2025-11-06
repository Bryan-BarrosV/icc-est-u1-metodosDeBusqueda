package views;

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
}