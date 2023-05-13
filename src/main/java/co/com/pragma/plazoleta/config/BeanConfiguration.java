package co.com.pragma.plazoleta.config;

import co.com.pragma.plazoleta.adapters.driven.jpa.mysql.adapter.RestaurantMysqlAdapter;
import co.com.pragma.plazoleta.adapters.driven.jpa.mysql.mapper.IRestaurantEntityMapper;
import co.com.pragma.plazoleta.adapters.driven.jpa.mysql.repository.IRestaurantRepository;
import co.com.pragma.plazoleta.adapters.driving.http.handlers.IRestaurantHandler;
import co.com.pragma.plazoleta.domain.api.IRestaurantServicePort;
import co.com.pragma.plazoleta.domain.spi.IRestaurantPersistencePort;
import co.com.pragma.plazoleta.domain.usecase.RestaurantUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantEntityMapper restaurantEntityMapper;

    @Bean
    public IRestaurantServicePort restaurantServicePort(){
        return new RestaurantUseCase(restaurantPersistencePort());
    }

    @Bean
    public IRestaurantPersistencePort restaurantPersistencePort(){
        return new RestaurantMysqlAdapter(restaurantRepository, restaurantEntityMapper);
    }

}
