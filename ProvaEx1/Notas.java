package ProvaEx1;

public class Notas {
    private double n1;
    private double n2;
    private double n3;


    public Notas(double n1, double n2, double n3) {
        setN1(n1);
        setN2(n2);
        setN3(n3);
    }

    public Notas() {
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        if (n1 >= 0 && n1 <= 10) {
            this.n1 = n1;
        }
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        if (n2 >= 0 && n2 <= 10) {
            this.n2 = n2;
        }
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        if (n3 >= 0 && n3 <= 10) {
            this.n3 = n3;
        }
    }


    public double getMedia() {
        return (n1 + n2 + n3) / 3.0;
    }

    public String toString() {
        return "Notas: " + n1 + ", " + n2 + ", " + n3 +
                " Média: " + getMedia();
    }
}
