import java.util.Scanner;

public class Perso {
    private String type;
    private int vie = 0;
    private int degat = 0;



    public class perso(int pv , int pdeg) {
        this.type ="perso";
        this.vie = pv;
        this.degat = pdeg;
    }


    public String getName() {
        return this.type;
    }

    public int getPv() {
       return this.vie;
    }


    public int getDeg() {
        return this.degat;
    }

    public void setVie(int vie){
        Scanner scan = new Scanner(System.in);

    }

}
