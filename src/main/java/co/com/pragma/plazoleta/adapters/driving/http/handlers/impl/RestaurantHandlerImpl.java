package co.com.pragma.plazoleta.adapters.driving.http.handlers.impl;

import co.com.pragma.plazoleta.adapters.driving.http.dto.request.RestaurantRequestDto;
import co.com.pragma.plazoleta.adapters.driving.http.handlers.IRestaurantHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantHandlerImpl implements IRestaurantHandler {

    @Override
    public void saveRestaurant(RestaurantRequestDto restaurantRequestDto) {

    }
}
