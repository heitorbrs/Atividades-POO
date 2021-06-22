package exercicio1;

public class Gerente extends Funcionario {
    
    private int classe;
    private String setores;

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public String getSetores() {
        return setores;
    }

    public void setSetores(String setores) {
        this.setores = setores;
    }
         
    public String tipoClasse(){
        
        if(classe == 1){
            return "Engenheiro";
        }
        else if (classe == 2){
            return "Administrador";
        }
        else {
            return "TI";
        }
        
    }
    
}
