package ggarciapruebastreams.BL;

import ggarciapruebastreams.Helpers.Helpers;
import ggarciapruebastreams.ML.Persona;
import java.time.LocalDate;
import java.time.Period;

import java.time.format.DateTimeFormatter;
import java.util.Random;

public class PersonaBuilder {

    public static Persona personas(String segmento) {
        String[] partes = segmento.split("\\|");
        Persona persona = new Persona();
        Helpers helpers = new Helpers();

        String nombre = helpers.capitalizar(partes[0].trim());
        String apellidoPaterno = helpers.capitalizar(partes[3].trim());
        String apellidoMaterno = helpers.capitalizar(partes[4].trim());
        persona.setNombreCompleto(nombre + " " + apellidoPaterno + " "+apellidoMaterno);
        
        persona.setGenero(partes[5].trim().toUpperCase());
        
        LocalDate fechaNacimiento = LocalDate.parse(partes[2].trim(),helpers.getFMT_Entrada());
        persona.setFechaNacimiento(fechaNacimiento);
        
        int edad = Period.between(fechaNacimiento,LocalDate.now()).getYears();
        persona.setEdad(edad);
        
        String id = helpers.buildId(nombre, edad, persona.getGenero());
        persona.setId(id);
        
        String dominio = partes[1].trim().toLowerCase();
        String correo = helpers.builCorreo(nombre, edad, id, dominio);
        persona.setCorreo(correo);
        
        return persona;

    }
}
