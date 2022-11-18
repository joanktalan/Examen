package Examen.Otros;

public class Domicilio {

    private String calle;

    private int altura;

    public Domicilio(String calle, int altura) {
        this.calle = calle;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return calle + " " + altura;
    }

    
}
