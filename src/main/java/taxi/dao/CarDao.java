package taxi.dao;

import java.util.List;
import java.util.Optional;
import taxi.model.Car;

public interface CarDao {
    Car create(Car car);

    Optional<Car> get(Long id);

    List<Car> getAll();

    List<Car> getAllByDriver(Long driverId);

    Car update(Car car);

    boolean delete(Long id);
}
