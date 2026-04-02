package ggarciapruebastreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GGarciaPruebaStreams {

    private static final String SEGMENTO_REGEX = "[a-zA-Z]+-[a-zA-Z]+-\\\\d{2}/\\\\d{2}/\\\\d{4}-[a-zA-Z]+-[a-zA-Z]+";
    private static final Pattern LINEA_VALIDA = Pattern.compile("^" + SEGMENTO_REGEX + "^");

    public static void main(String[] args) throws IOException {
        String rutaArchivo = "resources/data.txt";
        List<String> lineasValidas = Files.lines(Paths.get(rutaArchivo))
                .filter(linea -> !linea.trim().isEmpty())
                .filter(linea -> {
                    boolean valida = LINEA_VALIDA.matcher(linea.trim()).matches();
                    System.out.println(valida ? "Correcto" : "Incorrecto" + " -> " + linea);
                    return valida;
                }).collect(Collectors.toList());
    }

}
