package ProvaEx1;

public class Aluno {
    private int codigo;
    private int idade;
    private String nome;
    private String cpf;
    private String endereco;
    private boolean sexo;
    private Notas notas;

    public Aluno(int cod, int i, String n, String cpf, String end, boolean s, Notas notas) {
        this.codigo = cod;
        this.idade = i;
        this.nome = n;
        this.cpf = cpf;
        this.endereco = end;
        this.sexo = s;
        this.notas = notas;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Notas getNotas() {
        return notas;
    }


    public String getSituacao() {
        if (notas.getMedia() >= 6) {
            return ("Aprovado");
        } else {
            return ("Reprovado");

        }
    }

    public String toString() {
        return "\nNome do Aluno: " + nome +
                "\nCódigo: " + codigo +
                "\nCPF: " + cpf +
                "\nIdade: " + idade +
                "\nEndereço: " + endereco +
                "\nSexo: " + (sexo ? "Masculino" : "Feminino") +
                "\nNotas: " + notas +
                "\nSituação: " + getSituacao();

    }

}
