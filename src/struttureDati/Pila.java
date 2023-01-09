package struttureDati;

import java.util.ArrayList;

public class Pila <T>{
    private ArrayList<T> pila = new ArrayList<>();


    public void push (T element){
        pila.add(element);
    }

    /**
     * Restituisce l'ultimo elemento inserito nella pila , se pila vuota lancia eccezione
     * @return element
     * @throws NullPointerException
     */
    public T pop() throws  NullPointerException{
        T element = null;

        if(pila.size()>0) {
            element = pila.get(pila.size() - 1);
            pila.remove(pila.size() - 1);
        }
        return element;
    }

    /***
     * return true if the pila has no elements
     * @return boolean
     */
    public boolean isEmpty(){
        return pila.size()==0;
    }
    public  int size(){
        return pila.size();
    }

}
