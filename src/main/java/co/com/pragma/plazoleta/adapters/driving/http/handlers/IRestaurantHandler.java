package co.com.pragma.plazoleta.adapters.driving.http.handlers;

import co.com.pragma.plazoleta.adapters.driving.http.dto.request.RestaurantRequestDto;

public interface IRestaurantHandler {
    void saveRestaurant(RestaurantRequestDto restaurantRequestDto);
}
