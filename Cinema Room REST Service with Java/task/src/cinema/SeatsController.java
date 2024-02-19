package cinema;

import cinema.Seat;
import cinema.SeatsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SeatsController {
    int rows = 9;
    int columns = 9;

    @GetMapping("/seats")
    public SeatsResponse getSeats() {
        List<Seat> seats = new ArrayList<>();
        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {
                seats.add(new Seat(row, column));
            }
        }

        // Create the response object
        SeatsResponse response = new SeatsResponse();
        response.setRows(rows);
        response.setColumns(columns);
        response.setSeats(seats);

        return response;
    }
}
