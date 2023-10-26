package preparcial1;

import estructura_base.Cola;
import estructura_base.Genero;
import estructura_base.Persona;

//Dada una Cola de Personas (nombre, edad, sexo), escribir un método que quite de la
//cola a los hombres cuya edad está entre los 30 y 50 años, los demás elementos de la
//Cola deben quedar en el mismo orden en el que estaban originalmente.
public class Ejercicio3 {
    public static void main(String[] args) {

        Cola<Persona> colaPersonas = new Cola<>();
        colaPersonas.encolar(new Persona("carlos", 22, Genero.MASCULINO));
        colaPersonas.encolar(new Persona("juan", 50, Genero.MASCULINO));
        colaPersonas.encolar(new Persona("pedro", 45, Genero.MASCULINO));
        colaPersonas.encolar(new Persona("katherine", 19, Genero.FEMENINO));
        colaPersonas.encolar(new Persona("monica", 35, Genero.FEMENINO));

        colaPersonas.imprimir();

        colaPersonas = eliminarHombres(colaPersonas);
        System.out.println();
        colaPersonas.imprimir();

    }

    private static Cola<Persona> eliminarHombres(Cola<Persona> colaPersonas) {

        int longitudCola = colaPersonas.getTamano();
        Cola<Persona> personasFilter = new Cola<>();

        for (int i = 0; i < longitudCola; i++) {
            Persona p = colaPersonas.desencolar();
            if(!(p.getEdad() >= 30 && p.getEdad() <= 50 && p.getGenero().equals(Genero.MASCULINO))){
                personasFilter.encolar(p);
            }
        }
        return personasFilter;
    }
}
