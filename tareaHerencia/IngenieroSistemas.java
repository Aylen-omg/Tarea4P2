

public class IngenieroSistemas extends Ingeniero
{
    private String lengProgFav;
    
    public IngenieroSistemas(String nombre, String nombreU, int numCelular, String lengProgFav){
        super(nombre, nombreU, numCelular);
        this.lengProgFav = lengProgFav; 
    }

    public String mostrarProgramaFav(){
        return "Mi lenguaje de programación favorito es " + lengProgFav ; 
    }

    @Override
    public String indicarUniversidad(){
        return "Estudié en la Universidad " + nombreU + " y estudié Ingeniería de Sistemas"; 
    }
}

