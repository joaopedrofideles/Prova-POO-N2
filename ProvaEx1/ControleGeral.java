package ProvaEx1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ControleGeral {

    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<CursoEspecializacao> cursosEsp = new ArrayList<>();
    private ArrayList<CursoMestrado> cursosMest = new ArrayList<>();


    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ControleGeral cg = new ControleGeral();
        cg.cadastrarTudo();
        cg.mostrarListas();

        System.out.println("\n FIM DO PROGRAMA ");
    }

    public void cadastrarTudo() {
        System.out.println(" CADASTRO DE DADOS ");

        for (int i = 0; i < 2; i++) {
            System.out.println("\nCadastro do Aluno " + (i + 1));

            System.out.print("Código: ");
            int cod = sc.nextInt();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("CPF (11 dígitos): ");
            String cpf = sc.nextLine();

            while (cpf.length() != 11) {
                System.out.print("CPF inválido. Digite novamente: ");
                cpf = sc.nextLine();
            }


            System.out.print("Endereço: ");
            String end = sc.nextLine();

            System.out.print("Sexo (true = M / false = F): ");
            boolean sexo = sc.nextBoolean();


            double n1, n2, n3;
            do {
                System.out.print("Nota 1 (0 a 10): ");
                n1 = sc.nextDouble();
            } while (n1 < 0 || n1 > 10);

            do {
                System.out.print("Nota 2 (0 a 10): ");
                n2 = sc.nextDouble();
            } while (n2 < 0 || n2 > 10);

            do {
                System.out.print("Nota 3 (0 a 10): ");
                n3 = sc.nextDouble();
            } while (n3 < 0 || n3 > 10);

            Notas notas = new Notas(n1, n2, n3);

            alunos.add(new Aluno(cod, idade, nome, cpf, end, sexo, notas));
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("\nCadastro do Curso " + (i + 1));

            System.out.print("Código: ");
            int cod = sc.nextInt();

            System.out.print("Carga horária (maior que 0): ");
            int ch = sc.nextInt();
            while (ch <= 0) {
                System.out.print("Valor inválido. Digite novamente: ");
                ch = sc.nextInt();
            }

            System.out.print("Sala: ");
            int sala = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome do curso: ");
            String nome = sc.nextLine();

            System.out.print("Nome do professor: ");
            String prof = sc.nextLine();

            System.out.print("Valor do curso (maior que 0): ");
            double valor = sc.nextDouble();
            while (valor <= 0) {
                System.out.print("Valor inválido. Digite novamente: ");
                valor = sc.nextDouble();
            }

            cursos.add(new Curso(cod, ch, sala, nome, prof, valor, alunos));
        }


        for (int i = 0; i < 2; i++) {
            System.out.println("\nCadastro Curso ESPECIALIZAÇÃO " + (i + 1));

            System.out.print("Código: ");
            int cod = sc.nextInt();

            System.out.print("Carga horária: ");
            int ch = sc.nextInt();

            System.out.print("Sala: ");
            int sala = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Professor: ");
            String prof = sc.nextLine();

            System.out.print("Valor (maior que 0): ");
            double valor = sc.nextDouble();

            System.out.print("Lato Sensu (true/false): ");
            boolean ls = sc.nextBoolean();

            CursoEspecializacao ce = new CursoEspecializacao(cod, ch, sala, nome, prof, valor, alunos, ls);
            ce.setAdicionalDiploma();
            cursosEsp.add(ce);
        }


        for (int i = 0; i < 2; i++) {
            System.out.println("\nCadastro Curso MESTRADO " + (i + 1));

            System.out.print("Código: ");
            int cod = sc.nextInt();

            System.out.print("Carga horária: ");
            int ch = sc.nextInt();

            System.out.print("Sala: ");
            int sala = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Professor: ");
            String prof = sc.nextLine();

            System.out.print("Valor (maior que 0): ");
            double valor = sc.nextDouble();

            System.out.print("Stricto Sensu (true/false): ");
            boolean ss = sc.nextBoolean();

            CursoMestrado cm = new CursoMestrado(cod, ch, sala, nome, prof, valor, alunos, ss);
            cm.setAdicionalDiploma();
            cursosMest.add(cm);
        }
    }

    public void mostrarListas() {
        System.out.println("\n ESCOLHA UMA LISTA PARA MOSTRAR ");
        System.out.println("1 - Alunos");
        System.out.println("2 - Cursos");
        System.out.println("3 - Cursos Especialização");
        System.out.println("4 - Cursos Mestrado");
        System.out.print("Opção: ");

        int op = sc.nextInt();

        System.out.println("\n===== INFORMAÇÕES =====");

        switch (op) {
            case 1:
                for (Aluno a : alunos) System.out.println(a);
                break;

            case 2:
                for (Curso c : cursos) System.out.println(c);
                break;

            case 3:
                for (CursoEspecializacao ce : cursosEsp) System.out.println(ce);
                break;

            case 4:
                for (CursoMestrado cm : cursosMest) System.out.println(cm);
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
