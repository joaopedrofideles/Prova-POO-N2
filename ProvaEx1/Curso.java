package ProvaEx1;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private int cargaHoraria;
    private int sala;
    private String nome;
    private String nomeProfessor;
    private double valorCurso;
    private ArrayList<Aluno> alunos;

    public Curso(int cod, int ch, int sala, String n, String nP, double v, ArrayList<Aluno> alunos) {
        this.codigo = cod;
        this.cargaHoraria = ch;
        this.sala = sala;
        this.nome = n;
        this.nomeProfessor = nP;
        this.valorCurso = v;
        this.alunos = alunos;


    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }


    public int getSala() {
        return sala;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public double getValorCurso() {
        return valorCurso;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public String toString() {
        return "Código: " + codigo +
                "Curso: " + nome +
                "\nCarga Horária: " + cargaHoraria +
                "\nSala: " + sala +
                "\nNome do Professor " + nomeProfessor +
                "\nValor do Curso: R$ " + valorCurso +
                "\nLista de ALunos: " + alunos.size();

    }
}






