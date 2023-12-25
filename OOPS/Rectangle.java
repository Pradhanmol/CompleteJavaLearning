

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    private int calculateAreaOfRectangle(int width, int height) {
        return width *height;
    }
    
    private int calculatePeriOfRectangle(int width, int height) {
        return 2*(width*height);
    }
    public int getArea(int width, int height) {
        int area = calculateAreaOfRectangle(width, height);
        return area;
    }
    public int getPeri(int width, int height){
        int peri = calculatePeriOfRectangle(width, height);
        return peri;
    }
}
