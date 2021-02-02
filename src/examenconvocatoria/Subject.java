package examenconvocatoria;

/**
 *
 * @author alvaroafonsolopez
 */
public interface Subject {
    public void addObserver(Observer ob);
    public void removeObserver(Observer ob);
    
    //nombre disitinto al del UML porque la clase Object tiene 
    //ya un método final con ese nombre
    public void notifyOb();
    public void setAmount(Observer ob, double amount);
    @Override
    public String toString();
    public String getName();
    public void addImage(Image img);
}
