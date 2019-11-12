package Entitati;

public class Patrat implements FiguraGeometrica {
    private double latura;

    @Override
    public double Perimetru() {
        return (latura*4);
    }
}
