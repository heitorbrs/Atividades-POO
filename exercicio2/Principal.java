package exercicio2;

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("\n>>> TELEVISÃO 1: ");
        
        Televisao tv1 = new Televisao();
        
        tv1.setVoltagem(127);
        tv1.setMarca("Samsung");
        tv1.setConsumo(50);
        tv1.setDimensao("media");
        tv1.setPolegadas(42);
        tv1.setTipo("Smart");
        tv1.setFuncoes("ligar, desligar, mudar volume, mudar canal");
        
        System.out.println("\nVoltagem: " + tv1.getVoltagem() + "V");
        System.out.println("Marca: " + tv1.getMarca());
        System.out.println("Consumo: " + tv1.getConsumo() + "W");
        System.out.println("Dimensão: " + tv1.getDimensao());
        System.out.println("Polegas: " + tv1.getPolegadas() + "in");
        System.out.println("Tipo: " + tv1.getTipo());
        System.out.println("Funções: " + tv1.getFuncoes());
        
        System.out.println("\n>>> TELEVISÃO 2: ");
        
        Televisao tv2 = new Televisao();
        
        tv2.setVoltagem(220);
        tv2.setMarca("LG");
        tv2.setConsumo(60);
        tv2.setDimensao("grande");
        tv2.setPolegadas(55);
        tv2.setTipo("Normal");
        tv2.setFuncoes("ligar, desligar, mudar volume");
        
        System.out.println("\nVoltagem: " + tv2.getVoltagem() + "V");
        System.out.println("Marca: " + tv2.getMarca());
        System.out.println("Consumo: " + tv2.getConsumo() + "W");
        System.out.println("Dimensão: " + tv2.getDimensao());
        System.out.println("Polegas: " + tv2.getPolegadas() + "in");
        System.out.println("Tipo: " + tv2.getTipo());
        System.out.println("Funções: " + tv2.getFuncoes());
        
        System.out.println("\n>>> MICROONDAS 1: ");
        
        Microondas m1 = new Microondas();
        
        m1.setVoltagem(127);
        m1.setMarca("Electrolux");
        m1.setConsumo(30);
        m1.setDimensao("pequeno");
        m1.setDisplayDigital(true);
        m1.setAutoLimpante(false);
        m1.setCapacidadeLitros(18);
        
        System.out.println("\nVoltagem: " + m1.getVoltagem() + "V");
        System.out.println("Marca: " + m1.getMarca());
        System.out.println("Consumo: " + m1.getConsumo() + "W");
        System.out.println("Dimensão: " + m1.getDimensao());
        System.out.println("Dislpay Digital: " + m1.isDisplayDigital());
        System.out.println("Auto Limpante: " +m1.isAutoLimpante());
        System.out.println("Capacidade: " + m1.getCapacidadeLitros() + "L");
        
        System.out.println("\n>>> MICROONDAS 2: ");
        
        Microondas m2 = new Microondas();
        
        m2.setVoltagem(220);
        m2.setMarca("Philco");
        m2.setConsumo(37);
        m2.setDimensao("medio");
        m2.setDisplayDigital(false);
        m2.setAutoLimpante(true);
        m2.setCapacidadeLitros(26);
        
        System.out.println("\nVoltagem: " + m2.getVoltagem() + "V");
        System.out.println("Marca: " + m2.getMarca());
        System.out.println("Consumo: " + m2.getConsumo() + "W");
        System.out.println("Dimensão: " + m2.getDimensao());
        System.out.println("Dislpay Digital: " + m2.isDisplayDigital());
        System.out.println("Auto Limpante: " +m2.isAutoLimpante());
        System.out.println("Capacidade: " + m2.getCapacidadeLitros() + "L");
        
    }
    
}
