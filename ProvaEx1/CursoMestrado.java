package ProvaEx1;

import java.util.ArrayList;

public class CursoMestrado extends Curso {

    private boolean strictoSensu;
    private double adicionalDiploma;

    public CursoMestrado(int cod, int ch, int sala, String n, String nP, double v, ArrayList<Aluno> alunos, boolean lS) {

        super(cod, ch, sala, n, nP, v, alunos);
        this.strictoSensu = lS;
        setAdicionalDiploma();
    }

    public double getAdicionalDiploma() {
        return adicionalDiploma;
    }

    public void setAdicionalDiploma() {
        int quantidadeAlunos = getAlunos().size();

        if (quantidadeAlunos <= 5) {
            adicionalDiploma = quantidadeAlunos * 45.0;
        } else if (quantidadeAlunos <= 15) {
            adicionalDiploma = quantidadeAlunos * 43.0;
        } else if (quantidadeAlunos <= 30) {
            adicionalDiploma = quantidadeAlunos * 40.0;
        } else {
            adicionalDiploma = quantidadeAlunos * 36.0;
        }
    }

    public boolean isStrictoSensu() {
        return strictoSensu;
    }

    public void setStrictoSensu(boolean strictoSensu) {
        this.strictoSensu = strictoSensu;
    }

    public String toString() {
        return super.toString() +
                "\nStricto Sensu: " + strictoSensu +
                "\nAdicional Diploma: R$ " + adicionalDiploma;
    }
}
