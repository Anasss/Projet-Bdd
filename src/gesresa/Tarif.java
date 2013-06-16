package gesresa;

/**
 * Description d'un tarif pour un client. Un objet Tarif est immutable.
 * <p>
 * Note : Cette classe d�crit les donn�es <b>pour les besoins de l'interface
 * applicative seulement</b>. L'organisation des donn�es dans la base peut �tre
 * enti�rement diff�rente. C'est le r�le de l'interface applicative de faire la
 * conversion entre les deux repr�sentations, dans les deux sens.
 * 
 * @author Busca
 * 
 */
public class Tarif {

    //
    // ATTRIBUTS D'OBJET
    //
    private final String libelle;
    private final float prix;

    //
    // CONSTRUCTEURS, ACCESSEURS, ETC.
    //
    public Tarif(String libelle, float prix) {
	this.libelle = libelle;
	this.prix = prix;
    }

    public String getLibelle() {
	return libelle;
    }

    public float getPrix() {
	return prix;
    }

    @Override
    public String toString() {
	return "Tarif [libelle=" + libelle + ", prix=" + prix + "]";
    }

}
