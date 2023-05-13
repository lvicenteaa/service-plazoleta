package co.com.pragma.plazoleta.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RestaurantResponseDto {
    private String name;
    private String nit;
    private String address;
    private String telephone;
    private String urlLogo;
    private String idOwner;
}
