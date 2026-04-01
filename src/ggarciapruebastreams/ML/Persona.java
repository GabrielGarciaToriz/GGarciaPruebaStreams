package ggarciapruebastreams.ML;

import java.time.LocalDate;

public class Persona {

    private int Id;
    private String Nombre;
    private String ApelidoPaterno;
    private String ApellidoMaterno;
    private int Edad;
    private LocalDate FechaNacimiento;
    private String Correo;

    public Persona() {

    }

    public Persona(int Id, String Nombre, String ApelidoPaterno, String ApellidoMaterno, int Edad, LocalDate FechaNacimiento, String Correo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.ApelidoPaterno = ApelidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Edad = Edad;
        this.FechaNacimiento = FechaNacimiento;
        this.Correo = Correo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApelidoPaterno() {
        return ApelidoPaterno;
    }

    public void setApelidoPaterno(String ApelidoPaterno) {
        this.ApelidoPaterno = ApelidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
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
