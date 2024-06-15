package co.edu.cue.practicaSpring_.mapping.mappers;


import co.edu.cue.practicaSpring_.domain.model.Reservation;
import co.edu.cue.practicaSpring_.mapping.DTO.ReservationsDTO;
import co.edu.cue.practicaSpring_.repository.UserRepository;
import co.edu.cue.practicaSpring_.repository.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationsMapper {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VehiclesRepository vehiclesRepository;

    public ReservationsDTO mapFromModel(Reservation reservation) {
        return ReservationsDTO.builder()
                .userId(reservation.getUser().getId())
                .vehicleId(reservation.getVehicle().getId())
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .build();
    }

    public Reservation mapFromDTO(ReservationsDTO reservationsDTO) {
        return Reservation.builder()
                .user(userRepository.findById(reservationsDTO.userId()).orElseThrow(() -> new IllegalArgumentException("User not found")))
                .vehicle(vehiclesRepository.findById(reservationsDTO.vehicleId()).orElseThrow(() -> new IllegalArgumentException("Vehicle not found")))
                .startDate(reservationsDTO.startDate())
                .endDate(reservationsDTO.endDate())
                .build();
    }

}
