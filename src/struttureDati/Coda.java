package struttureDati;

import java.util.ArrayList;

public class Coda<T>{
    private ArrayList<T> coda = new ArrayList<>();

    public void push (T element){
        coda.add(element);
    }
    public T pop(){
        T element = null;
        element = coda.get(0);
        coda.remove(0);
        return element;
    }
    public boolean isEmpty(){
        return  coda.isEmpty();
    }

}
