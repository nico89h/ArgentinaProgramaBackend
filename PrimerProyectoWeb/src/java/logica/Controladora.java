package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;


public class Controladora {
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();
    
    public void crearPersona(Persona per){
        controlPersis.crearPersona(per);
    }
    public void eliminarPersona(int id) throws NonexistentEntityException{
        controlPersis.eliminarPersona(id);
    }
    public void eliminarPersona(Persona pers) throws NonexistentEntityException{
        controlPersis.eliminarPersona(pers);
    }
    public List<Persona> traerPersonas(){
        return controlPersis.traerPersonas();
    }
}
