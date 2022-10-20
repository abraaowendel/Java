package entities;

public class Approved {
    private String name;
    private double nota1;
    private double nota2;
    private double media;
    
    public Approved(String name, double nota1, double nota2) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        setMedia(nota1, nota2);
    }

    public String getName() {
        return name;
    }

    public double getMedia() {
        return media;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
    
    public void setMedia(double nota1, double nota2){
        this.media = (nota1 + nota2) / 2;
    }
    
}
