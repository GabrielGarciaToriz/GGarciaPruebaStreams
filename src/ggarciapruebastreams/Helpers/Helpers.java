package ggarciapruebastreams.Helpers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Helpers {

    private static final DateTimeFormatter FMT_Entrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FMT_Salida = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final Random random = new Random();

    public DateTimeFormatter getFMT_Entrada() {
        return FMT_Entrada;
    }

    public DateTimeFormatter getFMT_Salida() {
        return FMT_Salida;
    }

    public Random getRandom() {
        return random;
    }

    public Helpers() {
    }

    public String capitalizar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        return Character.toUpperCase(texto.charAt(0)) + texto.substring(1).toLowerCase();

    }

    public String buildId(String nombre, int edad, String genero) {
        String prefijo = nombre.substring(0, Math.min(2, nombre.length())).toLowerCase();
        int digitos = 1000 + random.nextInt(9000);
        return prefijo + edad + genero + digitos;
    }

    public String builCorreo(String nombre, int edad, String id, String dominio) {
        return new StringBuilder()
                .append(nombre.toLowerCase())
                .append(".")
                .append(edad)
                .append(".")
                .append(id)
                .append("@")
                .append(dominio)
                .append(".com")
                .toString();
    }

    public String formatearFecha(LocalDate fecha) {
        return fecha.format(FMT_Salida);
    }

}
