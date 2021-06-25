
/**
 * Write a description of class IngenieroCivil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IngenieroCivil extends Ingeniero
{
    private int numConstrucciones;
    
    public IngenieroCivil(String nombre, String nombreU, int numCelular, int numConstrucciones){
        super(nombre, nombreU, numCelular);
        this.numConstrucciones = numConstrucciones; 
    }

    public String indicarConstrucciones(){
        String resp = " ";
        if(numConstrucciones==1){
            resp = "Hice una construcción"; 
        } else if(numConstrucciones>=1){
            resp = "Hice " + numConstrucciones + " construcciones";  

        }
        return resp;
    }

    @Override
    public String indicarUniversidad(){
        return "Estudié en la Universidad " + nombreU + " y estudié Ingeniería Civil"; 
    }
}
