package Entitati;

public abstract class FiguriGemotriceFactory {

    public static FiguraGeometrica creazaFigura(FiguriGeometrice figura) {
        FiguraGeometrica abcd=null;
        switch (figura) {
            case CERC:
                abcd=new Cerc();

                break;
            case DREPTUNGHI:
                abcd= new Dreptunghi();
                break;
            default:
                System.out.println("nu exista");
                break;
        }

        return abcd;

    }
}
