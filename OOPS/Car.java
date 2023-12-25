import java.util.Date;

public class Car {
    private String color;
    private String model;
    private Date year;
    private int price;

    Car(String color, String model, Date year, int price ){
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setcolor(String carColor) {
        color = carColor;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String carModel) {
        model = carModel;
    }
    public Date getYear() {
        return year;
    }
    public void setYear(Date carYear) {
        year = carYear;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int carPrice) {
        price = carPrice;
    }
}
