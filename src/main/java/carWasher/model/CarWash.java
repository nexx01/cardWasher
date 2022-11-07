package carWasher.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CarWash {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Car car;
    private Date date;
    private int price;

    public CarWash() {
    }

    public CarWash(int id, Car car, Date date, int price) {
        this.id = id;
        this.car = car;
        this.date = date;
        this.price = price;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CarWash{" +
                ", car=" + car +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
