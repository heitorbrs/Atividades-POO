package exercicio2;

public class Microondas extends Eletrodomestico{
    
    private boolean displayDigital;
    private boolean autoLimpante;
    private int capacidadeLitros;

    public boolean isDisplayDigital() {
        return displayDigital;
    }

    public void setDisplayDigital(boolean displayDigital) {
        this.displayDigital = displayDigital;
    }

    public boolean isAutoLimpante() {
        return autoLimpante;
    }

    public void setAutoLimpante(boolean autoLimpante) {
        this.autoLimpante = autoLimpante;
    }

    public int getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }
    
}
