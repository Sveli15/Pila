package pila;
public interface Ipila<T> {
    
    public void push (T elemento) throws Excepcion;
    public T pop() throws Excepcion;
    public T peek() throws Excepcion;
    public boolean empty();
    
    
    
}
