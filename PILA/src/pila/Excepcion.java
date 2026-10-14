package pila;
public class Excepcion extends RuntimeException {
    
    public Excepcion(){
        super();
    }
    
    public Excepcion(String msg){
        super(msg);
    }
}
