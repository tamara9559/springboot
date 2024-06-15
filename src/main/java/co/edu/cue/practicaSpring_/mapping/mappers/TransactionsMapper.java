package co.edu.cue.practicaSpring_.mapping.mappers;




import co.edu.cue.practicaSpring_.domain.model.Reservation;
import co.edu.cue.practicaSpring_.domain.model.Transaction;
import co.edu.cue.practicaSpring_.mapping.DTO.TransactionsDTO;
import co.edu.cue.practicaSpring_.repository.ReservationsRepository;

import java.time.Instant;

public class TransactionsMapper {

    public static Transaction mapFromDTO(TransactionsDTO transactionsDTO, ReservationsRepository reservationsRepository) {
        Reservation reservation = reservationsRepository.findById(transactionsDTO.reservationId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid reservation ID"));

        return Transaction.builder()
                .reservation(reservation)
                .amount(reservation.getTotalCost())
                .transactionDate(Instant.now())
                .paymentMethod(transactionsDTO.paymentMethods())
                .build();
    }

    public static TransactionsDTO mapFromModel(Transaction transaction) {
        return TransactionsDTO.builder()
                .reservationId(transaction.getReservation().getId())
                .paymentMethods(transaction.getPaymentMethod())
                .build();
    }
}