package pila;
public class pilaa<T> implements Ipila<T> {

     
     protected int nElementos;
     private final T pilaa[];
     private final int tampila;

    public pilaa(Class<T> tipoDato, int tampila) {
        this.tampila = tampila;
        nElementos = 0;
        pilaa = (T[])java.lang.reflect.Array.newInstance(tipoDato,tampila);      
    }
    
    public void push(T elemento) throws Excepcion {
        if(nElementos >= tampila){
           throw new Excepcion("Lista llena");
        }
        
      pilaa[nElementos] = elemento;
      nElementos++;
      
    }

    @Override
    public T pop() throws Excepcion {
        if(nElementos == 0){
             throw new Excepcion("Lista llena");
        }
        
        T elemento = pilaa[nElementos-1];
        nElementos--;
        return elemento;
    }

    @Override
    public T peek() throws Excepcion {
       if(nElementos == 0){
             throw new Excepcion("Lista llena");
        } 
        return pilaa[nElementos-1];    
    }

    @Override
    public boolean empty() {
        return nElementos == 0;
    }

   
}

   
