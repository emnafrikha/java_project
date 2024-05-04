package miniprojet;

import java.util.List;

public class Index {
    private String requete;
    private static List<String> FaireStatFichier{  
        List<String> MotFichier = new ArrayList<String>();
        List<mot_occurence> StatFichier = new ArrayList<mot_occurence>();
        List<String> ListeRecherche = new ArrayList<String>();
        MotFichier =lire(string fichier).TraiteurMotVide.TraiterCarSpaciaux();
        for (int i = 0; i < MotFichier.size(); i++) {
            
            for (int j = 0; j < StatFichier.size(); j++) {
                if (MotFichier.get(i).equals(StatFichier.get(j).getMot())) {
                    StatFichier.get(j).setOccurence(StatFichier.get(j).getOccurence() + 1);
                    break;
                }
            StatFichier.add(new mot_occurence(MotFichier.get(i), 1));  

                }

            }

           
        }

}

}
