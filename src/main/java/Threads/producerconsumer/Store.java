package Threads.producerconsumer;

import java.util.List;

public class Store {

   private List<Object> items;
   private int maxsize;

   Store(List<Object>items, int maxsize){
        this.items = items;
        this.maxsize = maxsize;
   }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public int getMaxsize() {
        return maxsize;
    }

    public void setMaxsize(int maxsize) {
        this.maxsize = maxsize;
    }

    public void addItem(){
        this.items.add(null);
        System.out.println("New Produced.Item count" + this.items.size());
    }

    public void removeItem(){
        this.items.remove(this.items.size()-1);
        System.out.println("Items consumed . New Count:" + this.items.size());
    }
}
