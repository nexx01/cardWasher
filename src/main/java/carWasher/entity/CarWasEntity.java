package carWasher.entity;

import carWasher.model.Car;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class CarWasEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Car car;

    private Date date;

    private int price;

    public CarWasEntity() {


    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarWasEntity that = (CarWasEntity) o;
        return id == that.id && price == that.price && Objects.equals(car, that.car) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, car, date, price);
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarWasEntity(int id, Car car, Date date, int price) {
        this.id = id;
        this.car = car;
        this.date = date;
        this.price = price;
    }
}
