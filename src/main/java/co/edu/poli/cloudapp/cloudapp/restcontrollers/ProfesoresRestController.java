package co.edu.poli.cloudapp.cloudapp.restcontrollers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.cloudapp.cloudapp.dto.ProfesorDTO;
import co.edu.poli.cloudapp.cloudapp.services.IProfesorService;

@RestController
@RequestMapping("/api/profesores")
public class ProfesoresRestController {
    @Autowired
    private IProfesorService profesorService;

    @GetMapping
    public ResponseEntity<List<ProfesorDTO>> getAll() {
        return ResponseEntity.ok(profesorService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProfesorDTO> create(@RequestBody ProfesorDTO dto) {
        ProfesorDTO created = profesorService.create(dto);
        return ResponseEntity.created(URI.create("/api/profesores/" + created.getIdProfesor())).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfesorDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(profesorService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProfesorDTO> update(@PathVariable Long id, @RequestBody ProfesorDTO dto) {
        
        return ResponseEntity.ok(profesorService.update(id, dto));
    }
    
}
