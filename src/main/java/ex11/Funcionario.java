package ex11;

// Não tem exercicio numero 10 no PDF da atividade

public class Funcionario {
    private String nome;
    private double salario;
    private int numFilhos;

    public Funcionario(String nome, double salario, int numFilhos) {
        this.nome = nome;
        this.salario = salario;
        this.numFilhos = numFilhos;
    }

    public double calcularAumento(double percentual) {
        return salario + (salario * percentual / 100);
    }

    public double calcularINSS() {
        if (salario <= 1000)
            return salario * 0.08;
        else if (salario <= 2500)
            return salario * 0.09;
        else
            return salario * 0.11;
    }

    public double calcularImpostoRenda() {
        if (salario <= 2000)
            return 0;
        else if (salario <= 3500)
            return salario * 0.15;
        else
            return salario * 0.275;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumFilhos() {
        return numFilhos;
    }

    public void setNumFilhos(int numFilhos) {
        this.numFilhos = numFilhos;
    }
}
