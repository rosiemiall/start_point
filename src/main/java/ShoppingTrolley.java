import java.util.ArrayList;

public class ShoppingTrolley {

    private ArrayList<String> items;

    public ShoppingTrolley(){
        this.items = new ArrayList<>();
    }

    public void addItem(String item){
        this.items.add(item);
    }

    public ArrayList<String> getItems() {
        return this.items;
    }

    public int countItems(){
        return this.items.size();
    }

    public boolean checkItem(String item){

        return this.items.contains(item);

    }

}
