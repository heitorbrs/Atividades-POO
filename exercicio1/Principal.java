package exercicio1;

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("********** Funcionarios **********");    
        
        Funcionario joao = new Funcionario();
        
        joao.setNome("Joao da Silva");
        joao.setSalarioMensal(1000);
        joao.setDepartamento("Financeiro");
        joao.setCodidoDeIdentificacao(1);
        joao.setFuncao("Controle do caixa");
        
        System.out.println("\nNome: " + joao.getNome());
        System.out.println("Salário Mensal: " + joao.getSalarioMensal());
        System.out.println("Departamento: " + joao.getDepartamento());
        System.out.println("Código de Identificação: " + joao.getCodidoDeIdentificacao());
        System.out.println("Função: " + joao.getFuncao());
        
        Funcionario maria = new Funcionario();
        
        maria.setNome("Maria Batista");
        maria.setSalarioMensal(1400);
        maria.setDepartamento("Administrativo");
        maria.setCodidoDeIdentificacao(2);
        maria.setFuncao("Gerenciar tarefas");
        
        System.out.println("\nNome: " + maria.getNome());
        System.out.println("Salário Mensal: " + maria.getSalarioMensal());
        System.out.println("Departamento: " + maria.getDepartamento());
        System.out.println("Código de Identificação: " + maria.getCodidoDeIdentificacao());
        System.out.println("Função: " + maria.getFuncao());
        
        System.out.println("\n************ Gerente ************");
        
        Gerente mateus = new Gerente();
        
        mateus.setNome("Mateus Lima");
        mateus.setSalarioMensal(2000);
        mateus.setDepartamento("Manutenção");
        mateus.setCodidoDeIdentificacao(3);
        mateus.setFuncao("Realizar manutenção de equipamentos");
        mateus.setClasse(1);
        mateus.setSetores("Operacional");
        
        System.out.println("\nNome: " + mateus.getNome());
        System.out.println("Salário Mensal: " + mateus.getSalarioMensal());
        System.out.println("Departamento: " + mateus.getDepartamento());
        System.out.println("Código de Identificação: " + mateus.getCodidoDeIdentificacao());
        System.out.println("Função: " + mateus.getFuncao());
        System.out.println("Classe: " + mateus.tipoClasse());
        System.out.println("Setores: " + mateus.getSetores());
        
        Gerente ana = new Gerente();
        
        ana.setNome("Ana Alves");
        ana.setSalarioMensal(1800);
        ana.setDepartamento("Administrativo");
        ana.setCodidoDeIdentificacao(4);
        ana.setFuncao("Gerenciar recursos da empresa");
        ana.setClasse(2);
        ana.setSetores("Logística");
        
        System.out.println("\nNome: " + ana.getNome());
        System.out.println("Salário Mensal: " + ana.getSalarioMensal());
        System.out.println("Departamento: " + ana.getDepartamento());
        System.out.println("Código de Identificação: " + ana.getCodidoDeIdentificacao());
        System.out.println("Função: " + ana.getFuncao());
        System.out.println("Classe: " + ana.tipoClasse());
        System.out.println("Setores: " + ana.getSetores());
    }
    
}
