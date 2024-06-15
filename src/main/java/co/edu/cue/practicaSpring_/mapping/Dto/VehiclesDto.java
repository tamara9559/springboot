package co.edu.cue.practicaSpring_.mapping.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record VehiclesDTO(@NotNull(message = "Vehicle type cannot be null")
                          String type,

                          @NotNull(message = "Make cannot be null")
                          @Size(min = 1, message = "Make cannot be empty")
                          String make,

                          @NotNull(message = "Model cannot be null")
                          @Size(min = 1, message = "Model cannot be empty")
                          String model,

                          @NotNull(message = "Year cannot be null")
                          @Positive(message = "Year must be positive")
                          Integer year,

                          @NotNull(message = "Price per day cannot be null")
                          @Positive(message = "Price per day must be positive")
                          BigDecimal pricePerDay,

                          @NotNull(message = "Vehicle status cannot be null")
                          String status) {
}
