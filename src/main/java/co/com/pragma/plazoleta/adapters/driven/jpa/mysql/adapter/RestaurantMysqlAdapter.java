package co.com.pragma.plazoleta.adapters.driven.jpa.mysql.adapter;

import co.com.pragma.plazoleta.adapters.driven.jpa.mysql.mapper.IRestaurantEntityMapper;
import co.com.pragma.plazoleta.adapters.driven.jpa.mysql.repository.IRestaurantRepository;
import co.com.pragma.plazoleta.domain.model.Restaurant;
import co.com.pragma.plazoleta.domain.spi.IRestaurantPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestaurantMysqlAdapter implements IRestaurantPersistencePort {

    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantEntityMapper restaurantEntityMapper;

    @Override
    public void saveRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurantEntityMapper.toEntity(restaurant));
    }
}
