package pila;
public class PILA {
    public static void main(String[] args) {
     
        pilaa<Integer> pila = new pilaa<>(Integer.class, 5);

        System.out.println("vacia? " + pila.empty());

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(25);
        pila.push(56);

        System.out.println("cima: " + pila.peek());

        System.out.println("eliminado: " + pila.pop());
        System.out.println("eliminado: " + pila.pop());
        System.out.println("eliminado: " + pila.pop());

        System.out.println("cima: " + pila.peek());

        System.out.println("vacia? " + pila.empty());
        
        System.out.println("eliminado: " + pila.pop());
        System.out.println("eliminado: " + pila.pop());
          
        System.out.println("vacia? " + pila.empty());
    }
}
    

