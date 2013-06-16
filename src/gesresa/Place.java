package gesresa;

/**
 * Description d'une place pour un client. Un objet Place est immutable.
 * <p>
 * Note : Cette classe d�crit les donn�es <b>pour les besoins de l'interface
 * applicative seulement</b>. L'organisation des donn�es dans la base peut �tre
 * enti�rement diff�rente. C'est le r�le de l'interface applicative de faire la
 * conversion entre les deux repr�sentations, dans les deux sens.
 * 
 * @author Busca
 * 
 */
public class Place {

    //
    // ATTRIBUTS D'OBJET
    //
    private final Representation representation;
    private final int numero;
    private final Tarif tarif;
    private final boolean estLibre;

    //
    // CONSTRUCTEURS, ACCESSEURS, ETC.
    //
    public Place(Representation representation, int numero, Tarif tarif, boolean estLibre) {
	this.representation = representation;
	this.numero = numero;
	this.tarif = tarif;
	this.estLibre = estLibre;
    }

    public Representation getRepresentation() {
	return representation;
    }

    public int getNumero() {
	return numero;
    }

    public Tarif getTarif() {
	return tarif;
    }

    public boolean isEstLibre() {
	return estLibre;
    }

    @Override
    public String toString() {
	return "Place [representation=" + representation + ", numero=" + numero + ", tarif=" + tarif + ", estLibre=" + estLibre
		+ "]";
    }

}
