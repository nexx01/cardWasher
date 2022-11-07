package carWasher.repository;

import carWasher.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
@Transactional(rollbackFor = Exception.class)
public class CarWasherRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Car> getCars() {
return entityManager.createQuery("from Car",Car.class).getResultList();
    }

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Car getCar(int id) {
        return entityManager.find(Car.class, id);

    }
}
