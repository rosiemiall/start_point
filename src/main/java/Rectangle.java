public class Rectangle {
    
    private int length;
    private int width;

    public Rectangle(int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }
    int area(){
        return this.length * this.width;
    }
    
    boolean isRectangle(){
        return this.length==this.width;
    }
    
    


}
