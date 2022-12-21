package com.portfolio.lg.Interface;

import com.portfolio.lg.Entity.Persona;
import java.util.List;


public interface IPersonaService  {
    //Traer una lista de personas
    public List<Persona> getPersona();
   
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long id);
}
