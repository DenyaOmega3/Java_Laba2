package entities;

public class Car {
    private static Long autoIncrement = 1L;
    private Long id;
    private String brand;
    private String model;
    private Integer releaseYear;
    private String color;
    private Integer price;
    private String registration;

    public Car() {
        //Should we do default constructor and constructor with only one parameter?
    }

    public Car(String brand, String model, Integer releaseYear, String color, Integer price, String registration) {
        this.id = autoIncrement++;
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
        this.color = color;
        this.price = price;
        this.registration = registration;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registration='" + registration + '\'' +
                '}';
    }
}
