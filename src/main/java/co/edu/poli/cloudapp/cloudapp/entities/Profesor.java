package co.edu.poli.cloudapp.cloudapp.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "profesores")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {

    @Id
    @Column(name = "id_profesor")
    private Long idProfesor;

    @Column(name = "nom_profesor", length = 80, nullable = false)
    private String nomProfesor;

    @Column(name = "ape_profesor", length = 80, nullable = false)
    private String apeProfesor;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "email", length = 100, nullable = false)
    private String email;
}
