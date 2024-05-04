package miniprojet;
import java.util.List;

public class App {
	public static void main(String[] args) throws Exception {
		Lecteur lecteur = new Lecteur();
        String cheminFichier = "C:\\Users\\user\\Desktop\\188.txt";
        List<String> words = lecteur.lire(cheminFichier);
    
	for (String word : words) {
        System.out.println(word);
    }}
}
