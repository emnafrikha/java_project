package miniprojet;

public class mot_occurence {

    private String mot;
    private int occurence;

    // Constructeur
    public mot_occurence(String mot, int occurence) {
        this.mot = mot;
        this.occurence = occurence;
    }

    // Méthodes getters et setters
    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public int getOccurence() {
        return occurence;
    }

    public void setOccurence(int occurence) {
        this.occurence = occurence;
    }

}
