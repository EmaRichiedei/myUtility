package struttureDati;

import java.util.ArrayList;

public class Coda<T>{
    private ArrayList<T> coda = new ArrayList<>();

    public void push (T element){
        coda.add(element);
    }

    /***
     *  restutuisce il primo elemento inserito nella coda, se coda vuota lancia eccezione
     * @return
     * @throws NullPointerException
     */
    public T pop() throws NullPointerException{
        T element = null;
        if(coda.size()>0) {
            element = coda.get(0);
            coda.remove(0);
        }
        return element;
    }
    public boolean isEmpty(){
        return  coda.isEmpty();
    }

    public int size(){
        return coda.size();
    }

}
