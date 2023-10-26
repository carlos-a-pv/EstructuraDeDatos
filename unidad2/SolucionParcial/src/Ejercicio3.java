import estructura.Cola;

public class Ejercicio3 {

    public class PilaConDosColas<T>{

        Cola<T> cola1;
        Cola<T> cola2;

        public void push(T value){
            cola1.encolar(value);

        }

        public T push(){
            return null;
        }
    }
}
