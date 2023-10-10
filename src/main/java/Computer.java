public class Computer {

    private int storage;
    private String printer;

    public Computer(int inputStorage){
        this.storage = inputStorage;
        this.printer = "no printer";
    }

    public int getStorage(){
        return this.storage;
    }
    
    public String getPrinter(){
        return this.printer;
    }

    public void setStorage(int newStorage){
        this.storage= newStorage;
    }
    
    public void setPrinter(String newPrinter){
        this.printer= newPrinter;
    }



    public int addStorage(int extraStorage){
        this.storage += extraStorage;
        return this.storage ;
    }

}
