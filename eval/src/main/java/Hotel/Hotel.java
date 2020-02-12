package Hotel;

import java.util.ArrayList;

public class Hotel extends ArrayList {
    public String nomHotel;
    public int nbChambres;
    public ArrayList<Chambre> chambres;
    public int etages;

    public Hotel(String nomHotel, int nbChambres, int nbEtages){
        this.nomHotel = nomHotel;
        this.nbChambres = nbChambres;
        this.etages = nbEtages;
        
    }

    public int getNbChambre(int nbChambres){
        return nbChambres;
    }

    public int nbChambresOccupées()
    {
    
    }

    public double tauxOccupation()
    {

    }

    public void louerChambre(String type, String nomOccupant, int nbJoursRestants){
        
    }
    
}