package co.com.pragma.plazoleta.adapters.driven.jpa.mysql.repository;

import co.com.pragma.plazoleta.adapters.driven.jpa.mysql.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
}
