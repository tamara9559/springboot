package co.edu.cue.practicaSpring_.mapping.mappers;


import co.edu.cue.practicaSpring_.domain.model.Vehicle;
import co.edu.cue.practicaSpring_.mapping.DTO.VehiclesDTO;

public class VehiclesMapper {

    public static VehiclesDTO mapFromModel(Vehicle vehicles) {
        return new VehiclesDTO(vehicles.getType(), vehicles.getMake(), vehicles.getModel(),
                vehicles.getYear(), vehicles.getPricePerDay(), vehicles.getStatus());
    }

    public static Vehicle mapFromDTO(VehiclesDTO vehiclesDTO) {
        return Vehicle.builder()
                .type(vehiclesDTO.type())
                .make(vehiclesDTO.make())
                .model(vehiclesDTO.model())
                .year(vehiclesDTO.year())
                .pricePerDay(vehiclesDTO.pricePerDay())
                .status(vehiclesDTO.status())
                .build();
    }

}
