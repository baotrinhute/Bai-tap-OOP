public class Rectangle {
    private CartesianPoint northWestCorner;
    private int width;
    private int height;
    public Rectangle(CartesianPoint northWestCorner, int width, int height){
        this.northWestCorner = northWestCorner;
        this.width = width;
        this.height = height;
    }
    public double distanceToO(){
        return this.northWestCorner.distanceToO();
    }
}
