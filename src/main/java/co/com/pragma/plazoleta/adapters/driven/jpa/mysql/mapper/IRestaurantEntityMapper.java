package co.com.pragma.plazoleta.adapters.driven.jpa.mysql.mapper;

import co.com.pragma.plazoleta.adapters.driven.jpa.mysql.entity.RestaurantEntity;
import co.com.pragma.plazoleta.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IRestaurantEntityMapper {
    RestaurantEntity toEntity(Restaurant restaurant);
}
