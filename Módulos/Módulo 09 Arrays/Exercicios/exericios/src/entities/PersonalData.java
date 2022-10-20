package entities;

public class PersonalData {
    private double altura;
    private String sexo;

    public PersonalData(double altura, String sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }

}
