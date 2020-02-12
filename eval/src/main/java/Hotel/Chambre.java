package Hotel;

public class Chambre {
    public int numeroChambre;
    public int joursRestants = 0;
    public String type;
    public String[]types = {"Simple","Double", "Suite"};
    public String nomOccupant = null;
    public boolean libre;

    public Chambre (int numeroChambre, String type)
    {
        this.numeroChambre = numeroChambre;
        for (int i = 0; i < types.length; i++) {
            if(types[i] == type){
                this.type = type;
            }else{
            this.type = "Simple";
            } 
        }
    }

    public boolean definirOccupant(String nomOccupant, int joursRestants){
        if(libre){
            this.nomOccupant = nomOccupant;
            this.joursRestants = joursRestants;
            libre = false;
        } else {
            libre = false;
        }
        
        return libre;

    }

    public void jourSuivant(int joursRestants) {
        for (int i = joursRestants; i > 0; i--) {
            joursRestants--;
            this.joursRestants = joursRestants;
        }
    }

    public String toString(int numeroChambre, String type){
        if(libre){
            return "Chambre" + numeroChambre + " - " + type + " - libre";
        } else {
            return "Chambre" + numeroChambre + " - " + type + " - louée";
        }
    }
    
}