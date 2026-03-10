package co.edu.poli.cloudapp.cloudapp.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfesorDTO {
    private Long idProfesor;
    private String nomProfesor;
    private String apeProfesor;
    private LocalDate fechaNacimiento;
    private String email;

}
