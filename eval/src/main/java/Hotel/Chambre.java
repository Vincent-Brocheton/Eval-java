package Hotel;

public class Chambre {
    public int numeroChambre;
    public int joursRestants;
    public String type;
    public String[]types = {"Simple","Double", "Suite"};
    public String nomOccupant;

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
        joursRestants = 0;
        nomOccupant = null;
    }

    public boolean definirOccupant(String nomOccupant, int joursRestants){
        boolean libre;
        if(numeroChambre)
        return libre;

    }
    
}