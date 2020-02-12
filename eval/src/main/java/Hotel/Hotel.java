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
    
}