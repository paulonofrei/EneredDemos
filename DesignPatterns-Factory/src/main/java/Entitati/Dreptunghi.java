package Entitati;

public class Dreptunghi implements FiguraGeometrica{
    private double lungime;
    private double latime;

    @Override
    public double Perimetru() {
        return (2*lungime+2*latime);
    }
}
