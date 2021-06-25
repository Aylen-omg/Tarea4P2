
public class IngenieroQuimico extends Ingeniero
{
    private String nombreIndustria;
    
    public IngenieroQuimico(String nombre, String nombreU, int numCelular, String nombreIndustria){
        super(nombre, nombreU, numCelular);
        this.nombreIndustria = nombreIndustria; 
    }

    public String indicarIndustria(){
        return "Trabajo en la Industria " + nombreIndustria; 
    }

    @Override
    public String indicarUniversidad(){
        return "Estudié en la Universidad " + nombreU + " y estudié Ingeniería química"; 
    }
}
