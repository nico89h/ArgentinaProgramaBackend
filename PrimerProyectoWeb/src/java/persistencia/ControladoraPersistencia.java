package persistencia;

import java.util.List;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    PersonaJpaController persJpa=new PersonaJpaController();
    public void crearPersona(Persona per){
        persJpa.create(per);
    }
    public void eliminarPersona(int id) throws NonexistentEntityException{
        persJpa.destroy(id);
    }
    public void eliminarPersona(Persona pers) throws NonexistentEntityException{
        persJpa.destroy(pers.getId());
    }
    
    public List<Persona> traerPersonas(){
        return persJpa.findPersonaEntities();
    }
    
    
}
