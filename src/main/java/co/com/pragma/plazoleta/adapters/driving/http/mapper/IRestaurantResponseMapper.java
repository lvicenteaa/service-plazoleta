package co.com.pragma.plazoleta.adapters.driving.http.mapper;

import co.com.pragma.plazoleta.adapters.driving.http.dto.response.RestaurantResponseDto;
import co.com.pragma.plazoleta.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantResponseMapper {
    @Mapping(source = "restaurant.name", target = "name")
    @Mapping(source = "restaurant.nit", target = "nit")
    @Mapping(source = "restaurant.address", target = "address")
    @Mapping(source = "restaurant.telephone", target = "telephone")
    @Mapping(source = "restaurant.urlLogo", target = "urlLogo")
    @Mapping(source = "restaurant.idOwner", target = "idOwner")
    RestaurantResponseDto restaurantToRestaurantResponse(Restaurant restaurant);
    List<RestaurantResponseDto> restaurantListToRestaurantResponseList(List<Restaurant> restaurantList);
}
