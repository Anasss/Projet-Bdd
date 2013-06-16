package gesresa;

import java.util.Date;
import java.util.List;

/**
 * Description d'une repr�sentation pour un client. Un objet Representation est
 * immutable.
 * <p>
 * Note : Cette classe d�crit les donn�es <b>pour les besoins de l'interface
 * applicative seulement</b>. L'organisation des donn�es dans la base peut �tre
 * enti�rement diff�rente. C'est le r�le de l'interface applicative de faire la
 * conversion entre les deux repr�sentations, dans les deux sens.
 * 
 * @author Busca
 * 
 */
public class Representation {

    //
    // ATTRIBUTS D'OBJET
    //
    private final String spectacle;
    private final String salle;
    private final Date date;
    private final List<Tarif> tarifs;

    //
    // CONSTRUCTEURS, ACCESSEURS, ETC.
    //
    public Representation(String spectacle, String salle, Date date, List<Tarif> tarifs) {
	this.spectacle = spectacle;
	this.salle = salle;
	this.date = date;
	this.tarifs = tarifs;
    }

    public String getSpectacle() {
	return spectacle;
    }

    public String getSalle() {
	return salle;
    }

    public Date getDate() {
	return date;
    }

    public List<Tarif> getTarifs() {
	return tarifs;
    }

    @Override
    public String toString() {
	return "Representation [spectacle=" + spectacle + ", salle=" + salle + ", date=" + date + ", tarifs=" + tarifs + "]";
    }

}
