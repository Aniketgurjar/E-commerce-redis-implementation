package dev.aniket.springrediscache3.Repository;

import dev.aniket.springrediscache3.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
