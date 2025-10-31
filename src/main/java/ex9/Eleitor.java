package ex9;

import java.util.Calendar;

public class Eleitor {
    private String nome;
    private int anoNascimento;

    public Eleitor(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String calcularTipoEleitor() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;

        if (idade < 16)
            return "Não Eleitor";
        else if ((idade >= 16 && idade < 18) || idade > 65)
            return "Eleitor Facultativo";
        else
            return "Eleitor Obrigatório";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}

