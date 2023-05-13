package co.com.pragma.plazoleta.domain.spi;

import co.com.pragma.plazoleta.domain.model.Restaurant;

public interface IRestaurantPersistencePort {

    void saveRestaurant(Restaurant restaurant);

}
