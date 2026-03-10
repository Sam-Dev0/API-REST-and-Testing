package co.edu.poli.cloudapp.cloudapp.services;

import java.util.List;

import co.edu.poli.cloudapp.cloudapp.dto.ProfesorDTO;

public interface IProfesorService {
    ProfesorDTO create(ProfesorDTO estudianteDTO);
    ProfesorDTO update(Long id, ProfesorDTO estudianteDTO);
    void delete(Long id);
    ProfesorDTO findById(Long id);
    List<ProfesorDTO> findAll();
}
