
package com.example.services;

import com.example.models.Mascota;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;


public interface MascotaService {
    
    List<Mascota> listadoMascota();
    Mascota mascotaUnico(int id);
    Mascota altaMascota(Mascota m);
    Mascota editarMascota(Mascota m);
    Mascota eliminarMascota(int id);
    
}
