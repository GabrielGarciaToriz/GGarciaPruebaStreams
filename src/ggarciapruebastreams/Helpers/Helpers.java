package ggarciapruebastreams.Helpers;

public class Helpers {
    private static String capitalizar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        return Character.toUpperCase(texto.charAt(0)) + texto.substring(1).toLowerCase();

    }

}

