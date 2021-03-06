package cz.fi.muni.pa165.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public class AddSportsMenDTO {
    @NonNull
    private Long sportsMen;
    @NonNull
    private Long competition;
}
