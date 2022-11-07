package carWasher.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String model;

    private String color;

    @ManyToOne
    private DriverEntity driver;

    private int year;

    public CarEntity() {
    }

    public CarEntity(int id, String model, String color, DriverEntity driver, int year) {

        this.id = id;
        this.model = model;
        this.color = color;
        this.driver = driver;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEntity carEntity = (CarEntity) o;
        return id == carEntity.id && year == carEntity.year && Objects.equals(model, carEntity.model) && Objects.equals(color, carEntity.color) && Objects.equals(driver, carEntity.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, driver, year);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DriverEntity getDriver() {
        return driver;
    }

    public void setDriver(DriverEntity driver) {
        this.driver = driver;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
