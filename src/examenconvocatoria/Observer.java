package examenconvocatoria;

/**
 *
 * @author alvaroafonsolopez
 */
public interface Observer {
    public void update(Observer ob, Subject sub);
    public String getName();
}
