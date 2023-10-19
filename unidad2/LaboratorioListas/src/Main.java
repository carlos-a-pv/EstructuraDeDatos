import Listas.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Lista lista = new Lista<Integer>();
        lista.addToEnd(2);
        lista.addToEnd(1);
        lista.addToEnd(4);
        lista.addToEnd(3);
        //lista.printList();
        //System.out.println();
        //removeEvennNumbers(lista);
        //lista = valuesOdd(lista);
        //int repeatValue = getNumberValueRepeated(lista, 10);
        //System.out.println(repeatValue);
        //lista.printList();

        //Listas.Lista<Integer> newList = getPositionsOdd(lista);
        //System.out.println();
        //newList.printList();
/*
        Lista<Persona> peopleList = new Lista<>();
        peopleList.addToEnd(new Persona("1004827192"));
        peopleList.addToEnd(new Persona("100483131"));
        peopleList.addToEnd(new Persona("1099271024"));

        peopleList.printList();
        System.out.println();
        Lista<Persona> peopleWithIdEven = getPeopleWithIdEven(peopleList);
        peopleWithIdEven.printList();*/

        /*ListaDoble<Persona> listaDoble = new ListaDoble<>();
        listaDoble.agregarfinal(new Persona("1232"));
        listaDoble.agregarfinal(new Persona("1"));
        listaDoble.agregarfinal(new Persona("1"));
        listaDoble.agregarfinal(new Persona("23"));

        Lista<Persona> newList = getPeopleWithIdEvenDoubleList(listaDoble);
        newList.printList();*/

        /*ListaSimpleCircular<Integer> listaCircular = new ListaSimpleCircular<>();
        listaCircular.agregarfinal(1);
        listaCircular.agregarfinal(2);
        listaCircular.agregarfinal(3);

        listaCircular.insertar(10,3);

        //System.out.println(listaCircular.buscar(-1).getValueNode());
        listaCircular.imprimirLista();*/

        /*
        Lista<Integer> lista1 = new Lista<>();
        lista1.addToEnd(1);
        lista1.addToEnd(2);
        lista1.addToEnd(3);

        Lista<Integer> lista2 = new Lista<>();
        lista2.addToEnd(4);
        lista2.addToEnd(5);
        lista2.addToEnd(6);

        Lista<Integer> lista3  = concatenarListar(lista1, lista2);
        lista3.printList();*/

        //polinomio();

        //pruebas ejercicio 13
        Lista<Integer> lista13 = new Lista<>();
        lista13.addToEnd(9);
        lista13.addToEnd(4);
        lista13.addToEnd(6);
        lista13.addToEnd(8);
        lista13.addToEnd(4);
        lista13.addToEnd(5);
        lista13.addToEnd(4);
        lista13.addToEnd(4);

        int maximaDistancia = lista.calcularMaximaDistancia(lista13.getNode(0), 4, 0,0,0);
        System.out.println("la maxima distancia es: "+maximaDistancia);

        //calcularMedia();

    }
    //1.Obtener los números de las posiciones impares de una lista enlazada simple de números
    public static Lista<Integer> getPositionsOdd(Lista<Integer> list){
        Lista<Integer> positionsOdd = new Lista<>();
        for (int i = 0; i < list.getSize(); i++) {
            if(i % 2 != 0){
                positionsOdd.addToEnd((Integer) list.getNode(i).getValueNode());
            }
        }
        return positionsOdd;
    }

    //2.Obtener en una lista las personas con id de longitud par
    private static Lista<Persona> getPeopleWithIdEven(Lista<Persona> peopleList) {
        Lista<Persona> peopleListNew = new Lista<>();

        for (int i = 0; i < peopleList.getSize(); i++) {
            Persona person = (Persona) peopleList.getNode(i).getValueNode();
            String id = person.getId();
            if(id.length() % 2 == 0){
                peopleListNew.addToEnd(person);
            }
        }
        return peopleListNew;
    }

    //3.Eliminar los números pares de una lista enlazada simple
    public static void removeEvennNumbers(Lista<Integer> list){
        for (int i = 0; i < list.getSize(); i++) {
            int num = (int) list.getNode(i).getValueNode();
            if(num % 2 == 0){
                list.remove(i);
            }
        }
    }

    //4.Escribir un método que devuelva una lista enlazada con los valores impares de una lista de números.
    public static Lista<Integer> valuesOdd(Lista<Integer> list){
        Lista<Integer> oddValues= new Lista<>();

        for (int i = 0; i < list.getSize(); i++) {
            int valueNode = (int) list.getNode(i).getValueNode();
            if(valueNode % 2 != 0){
                oddValues.addToEnd((int) list.getNode(i).getValueNode());
            }
        }

        return oddValues;
    }

    //5.Escribir un método que retorne la cantidad de veces que se repite un valor en una lista enlazada.
    public static int getNumberValueRepeated(Lista<Integer> list, int value) throws Exception {
        int ammount = 0;
        for (int i = 0; i < list.getSize(); i++) {
            if(list.getNode(i).getValueNode().equals(value)){
                ammount++;
            }
        }
        return ammount;
    }

    //6. Escribir el método imprimirHaciaAtras() de una lista doblemente enlazada.
    //ESTE METODO VA DENTRO DE LA CLASE ListaDoble!!!

    //7. Escribir el Iterador para una lista doblemente enlazada.🛫
    //ESTE METODO VA DENTRO DE LA CLASE ListaDoble!!!

    //8. Obtener la lista de personas que tengan cédula con cantidad de elementos par de una lista enlazada doble de personas.
    public static Lista<Persona> getPeopleWithIdEvenDoubleList(ListaDoble<Persona> list){
        Iterator iterator = list.iterator();
        Persona p;
        Lista<Persona> peopleList = new Lista<>();

        while(iterator.hasNext()){
            p = (Persona) iterator.next();
            if(p.getId().length() % 2 == 0){
                peopleList.addToEnd(p);
            }
        }
        return peopleList;
    }

    //9. Escribir el método insertar y buscar de una lista circular.
    //ESTOS METOSO VAN DENTRO DE LA CLASE ListaCircular!!!

    //10. Escribir un método que permita “concatenar” dos listas enlazadas simples, el método debe recibir
    // como parámetro dos objetos de tipo Listas.Lista, unirlas y retornar una lista que contenga a ambas.
    public static Lista<Integer> concatenarListar(Lista<Integer> lista1, Lista<Integer> lista2){
        Lista<Integer> newList = lista1;
        for (int i = 0; i < lista2.getSize(); i++) {
            newList.addToEnd(lista2.getValueNode(i));
        }
        return newList;
    }

    //11. Un polinomio se puede representar como una lista enlazada. El primer nodo de la lista representa el primer
    // término del polinomio, el segundo nodo al segundo término del polinomio y así sucesivamente. Cada nodo tiene
    // como campo dato el coeficiente del término y el exponente.
    public static void polinomio(){
        Scanner entrada = new Scanner(System.in);
        //System.out.print("INGRESE EL POLINOMIO: ");
        String polinomio = "3x4-4x2+11";
        double[] valoresX = {0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};

        String[] polinomioDividio = polinomio.split("[+-]");

        ListaPolinomio<Integer> listaPolinomio = new ListaPolinomio<>();
        for (int i = 0; i < polinomioDividio.length; i++) {
            if(polinomioDividio[i].contains("x")){
                int coeficiente = Integer.valueOf(polinomioDividio[i].split("x")[0]);
                int exponente = Integer.valueOf(polinomioDividio[i].split("x")[1]);
                NodoPolinomio<Integer> nodo = new NodoPolinomio<>(coeficiente, exponente);
                listaPolinomio.addToEnd(nodo);
            }else{
                int coeficiente = Integer.valueOf(polinomioDividio[i]);
                NodoPolinomio<Integer> nodo = new NodoPolinomio<>(coeficiente, 0);
                listaPolinomio.addToEnd(nodo);
            }
        }
        System.out.println("EL POLINOMIO ES EL SIGUIENTE: ");
        listaPolinomio.printList();
        System.out.println("\n");

        //tabla de valores
        //.5
        System.out.println("TABLA DE VALORES");
        for (int i = 0; i < valoresX.length; i++) {
            double valorx = valoresX[i];
            double resultado = 0;
            for (int j = 0; j < listaPolinomio.getSize(); j++) {
                int coeficiente = listaPolinomio.getNode(j).getCoeficiente();
                int exponente = listaPolinomio.getNode(j).getExponente();
                if(exponente == 0){
                    resultado += coeficiente;
                }else{
                    resultado += coeficiente*valorx*exponente;
                }
            }
            System.out.println("Resultado con X:"+valoresX[i]+" = "+resultado);
        }
    }

    //12. Calcular la media y la desviacion estandar
    public static double calcularMedia(){
        String[] numeros = leerArchivo("B:\\carlos.perez\\Documents\\UNIQUINDIO\\quinto_semestre\\estructura_datos\\unidad2\\Lista\\src\\resources\\numeros.txt");
        Lista<Integer> numerosConvertidos = convertirArregloEnLista(numeros);
        int suma = 0;
        for (int i = 0; i <numerosConvertidos.getSize() ; i++) {
            suma += (int) numerosConvertidos.getNode(i).getValueNode();
        }
        return suma/numerosConvertidos.getSize();
    }

    public static double calcularDesvicionEstandar(){
        String[] numeros = leerArchivo("B:\\carlos.perez\\Documents\\UNIQUINDIO\\quinto_semestre\\estructura_datos\\unidad2\\Lista\\src\\resources\\numeros.txt");
        Lista<Integer> numerosConvertidos = convertirArregloEnLista(numeros);
        double suma = 0;
        double media = calcularMedia();

        for (int i = 0; i < numerosConvertidos.getSize(); i++) {
            suma += Math.pow(( (double) numerosConvertidos.getNode(i).getValueNode() - media), 2);
        }

        return Math.sqrt( (suma) / (numerosConvertidos.getSize()-1) );
    }

    private static Lista<Integer> convertirArregloEnLista(Object[] array) {
        Lista<Integer> list = new Lista<>();
        for (int i = 0; i < array.length-1; i++) {
            int num = Integer.valueOf((String) array[i]);
            list.addToEnd(num);
        }

        return list;
    }

    public static String[] leerArchivo(String archivo){
        String[] partes = {};
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                partes = linea.split(",");
            }
            for (int i = 0; i < partes.length-1; i++) {
                System.out.print(partes[i]+"|");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return partes;
    }
}