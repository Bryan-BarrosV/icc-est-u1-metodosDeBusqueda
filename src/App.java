import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        ShowConsole sC = new ShowConsole();
        // metodosBusqueda.busquedaLineal( 5);

        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
            };
            String name ="Juan";

            Persona resultadoPersona = metodosBusqueda.serchPersonByName(personas, name);
            sC.showPersonResult(resultadoPersona,name);

            Persona resultadoPersona2= metodosBusqueda.findPersonaByAge(personas, 25);
            sC.showPersonResult(resultadoPersona2,25);

            Persona resultadoPersona3 = metodosBusqueda.findPersonaByValueName(personas, 498);
            boolean valorNombre = true;
            sC.showPersonResult3(resultadoPersona3, 498, valorNombre);
    }
}
