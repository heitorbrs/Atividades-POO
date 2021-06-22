package exercicio1;

public class Funcionario {
    
    private String nome;
    private double salarioMensal;
    private String departamento;
    private int codidoDeIdentificacao;
    private String funcao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCodidoDeIdentificacao() {
        return codidoDeIdentificacao;
    }

    public void setCodidoDeIdentificacao(int codidoDeIdentificacao) {
        this.codidoDeIdentificacao = codidoDeIdentificacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
