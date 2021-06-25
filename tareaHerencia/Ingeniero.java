
public class Ingeniero
{
    protected String nombre; 
    protected String nombreU; 
    protected int numCelular;

    public Ingeniero(String nombre, String nombreU, int numCelular){
        this.nombre = nombre; 
        this.nombreU = nombreU; 
        this.numCelular = numCelular;
    }

    public String presentarse(){
        return "Me llamo "+ nombre;
    }

    public String indicarUniversidad(){
        return "Estudié en la Universidad " + nombreU; 
    }

    public String darNumCelular(){
        return "Me puedes contactar con mi número de celular que es " + numCelular; 
    }
}
