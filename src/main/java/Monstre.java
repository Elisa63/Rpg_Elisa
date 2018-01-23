

public class Monstre {
    private int vie;
    private int degat;

    public Monstre(int pv , int pdeg) {
        this.vie = pv;
        this.degat = pdeg;
        }
        public int getPv(){
        return this.vie;
    }
    public int getDegat(){
        return this.degat;
    }
    public void vie(Monstre Pv ){
        int nb = (int) (Math.random() * (300 - 50) + 50) ;
        }

        public void degat(Monstre Pdeg){
            int nb = (int) (Math.random() * (20-5) +5);
        }








        }
