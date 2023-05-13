package co.com.pragma.plazoleta.adapters.driving.http.controller;

import co.com.pragma.plazoleta.adapters.driving.http.dto.request.RestaurantRequestDto;
import co.com.pragma.plazoleta.adapters.driving.http.handlers.IRestaurantHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/restaurant/")
@RequiredArgsConstructor
public class RestaurantRestController {

    private final IRestaurantHandler restaurantHandler;

    @Operation(summary = "Add a new restaurant",
            responses = {
                @ApiResponse(responseCode = "201", description = "Restaurant created",
                    content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map"))
                ),
            @ApiResponse(responseCode = "409", description = "Restaurant already exists",
                    content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))
            )})
    @PostMapping
    public ResponseEntity<Map<String, String>> saveRestaurant(@RequestBody RestaurantRequestDto restaurantRequestDto){
        restaurantHandler.saveRestaurant(restaurantRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(Collections.singletonMap("Mensaje 1", "Restaurant created"));
    }

}
