package ggarciapruebastreams.ML;

import java.time.LocalDate;

public class Persona {

    private String Id;
    private String NombreCompleto;
    private int Edad;
    private String Genero;
    private LocalDate FechaNacimiento;
    private String Correo;

    public Persona() {

    }

    public Persona(String Id, String NombreCompleto, int Edad, String Genero, LocalDate FechaNacimiento, String Correo) {
        this.Id = Id;
        this.NombreCompleto = NombreCompleto;
        this.Edad = Edad;
        this.Genero = Genero;
        this.FechaNacimiento = FechaNacimiento;
        this.Correo = Correo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

}
