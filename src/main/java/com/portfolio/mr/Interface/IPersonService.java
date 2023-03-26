package com.portfolio.mr.Interface;

import com.portfolio.mr.Entity.Person;
import java.util.List;

public interface IPersonService {
    //Traer una lista de personas
    public List<Person> getPerson();
    
    //Guardar un objeto de tipo Persona
    public void savePerson(Person person);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePerson(Long id);
    
    //Buscar una persona por ID
    public Person findPerson(Long id);
}
