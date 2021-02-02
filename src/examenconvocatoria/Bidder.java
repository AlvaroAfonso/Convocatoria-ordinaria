package examenconvocatoria;

/**
 *
 * @author alvaroafonsolopez
 */
public class Bidder implements Observer {

    private String name;
    
    public Bidder(String name){
        this.name = name;
    }
    
    @Override
    public void update(Observer ob, Subject sub) {
        if(this != ob){
            System.out.println("Hola " + name +", el usuario " + ob.getName() + " ha pujado en el artículo " +
                sub.getName() + ", quedando de la siguiente manera:\n" + sub);
        }
    }

    @Override
    public String getName() {
        return name;
    }
    
}
