package ggarciapruebastreams.BL;

import ggarciapruebastreams.ML.Persona;

import java.time.format.DateTimeFormatter;
import java.util.Random;

public class PersonaBuilder {
    private static final DateTimeFormatter FMT_Entrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FMT_Salida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final Random random = new Random();

    public static Persona personas(String segmento) {
        String[] partes = segmento.split("\\|");
        Persona persona = new Persona();


    }
}
