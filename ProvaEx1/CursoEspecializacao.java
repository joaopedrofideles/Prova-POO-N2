package ProvaEx1;

import java.util.ArrayList;

public class CursoEspecializacao extends Curso {

    private boolean latoSensu;
    private double adicionalDiploma;

    public CursoEspecializacao(int cod, int ch, int sala, String n, String nP, double v, ArrayList<Aluno> alunos, boolean lS) {

        super(cod, ch, sala, n, nP, v, alunos);

        this.latoSensu = lS;
        setAdicionalDiploma();
    }

    public double getAdicionalDiploma() {
        return adicionalDiploma;
    }

    public void setAdicionalDiploma() {
        int quantidadeAlunos = getAlunos().size();

        if (quantidadeAlunos <= 10) {
            adicionalDiploma = quantidadeAlunos * 25.0;
        } else if (quantidadeAlunos <= 30) {
            adicionalDiploma = quantidadeAlunos * 20.0;
        } else {
            adicionalDiploma = quantidadeAlunos * 18.0;
        }
    }

    public boolean isLatoSensu() {
        return latoSensu;
    }

    public void setLatoSensu(boolean latoSensu) {
        this.latoSensu = latoSensu;
    }

    public String toString() {
        return super.toString() +
                "\nLato Sensu: " + latoSensu +
                "\nAdicional Diploma: R$ " + adicionalDiploma;
    }
}




