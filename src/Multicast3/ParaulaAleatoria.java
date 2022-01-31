package Multicast3;

public class ParaulaAleatoria {

    String[] pal = {"ratita", "xiao", "rataxiao", "juanka"};
    int n;

    public ParaulaAleatoria(int n) {
        this.n = n;
    }


    public void setVel(int n) {
        this.n = n;
    }

    public String agafaVelocitat() {
        setVel((int)(Math.random()* pal.length));
        return pal[n];

    }

}

