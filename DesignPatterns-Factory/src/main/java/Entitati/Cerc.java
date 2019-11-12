package Entitati;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Cerc implements FiguraGeometrica{

    private double raza;

    @Override
    public double Perimetru() {
        return (2 * Math.PI * raza);
    }
}
