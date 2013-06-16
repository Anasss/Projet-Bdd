package gesresa;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Interface de r�servation de places de spectacle.
 * <p>
 * Note : il s'agit d'une interface applicative, les dates sont donc au format
 * java.util.Date.
 * 
 * @author Busca
 * 
 */
public interface GestionReservation {

    /**
     * Liste les repr�sentations d'un spectacle situ�es entre deux dates.
     * 
     * @param spectacle
     *            nom du spectacle cherch�
     * @param de
     *            d�but de p�riode cherch�e (incluse)
     * @param a
     *            fin de p�riode cherch�e (incluse)
     * 
     * @return la liste des repr�sentations correspondantes
     * @throws SQLException
     *             si une erreur survient lors de la manipulation des donn�es
     */
    List<Representation> listerRepresentations(String spectacle, Date de, Date a) throws SQLException;

    /**
     * Liste les places d'une repr�sentation. Deux strat�gies sont propos�es :
     * <ul>
     * <li>stable : l'application garantit que le statut libre/r�serv� des
     * places n'est pas modifi� jusqu'� l'appel d'une des m�thodes
     * <code>reserverPlaces</code> pour la m�me repr�sentation,
     * <li>instable : le statut des places peut changer apr�s l'appel de cette
     * m�thode ; en particulier, une place initialement d�clar�e libre peut ne
     * plus l'�tre au moment d'appeler <code>reserverPlaces</code>
     * </ul>
     * 
     * @param representation
     *            repr�sentation � consid�rer
     * @param stable
     *            vrai si le statut des places doit rester stable et faux sinon
     * 
     * @return la liste des places de la repr�sentation
     * @throws SQLException
     *             si une erreur survient lors de la manipulation des donn�es
     */
    List<Place> listerPlaces(Representation representation, boolean stable) throws SQLException;

    /**
     * R�serve une ou plusieurs places � un tarif donn� pour une repr�sentation.
     * S'il reste moins de places libres que demand� au tarif sp�cifi�, aucune
     * place n'est r�serv�e.
     * 
     * @param representation
     *            repr�sentation � consid�rer
     * @param nombre
     *            nombre de place � r�server
     * @param tarif
     *            tarif des places � r�server, <code>null</code> si indiff�rent
     * @return la liste des places r�serv�es, vide si toutes les places
     *         demand�es n'ont pu �tre r�serv�es
     * @throws SQLException
     *             si une erreur survient lors de la manipulation des donn�es
     */
    List<Place> reserverPlaces(Representation representation, int nombre, Tarif tarif) throws SQLException;

    /**
     * R�serve une liste de places donn�e. Si une des places demand�es n'est pas
     * libre, aucune place n'est r�serv�e.
     * 
     * @param representation
     *            repr�sentation � consid�rer
     * @param places
     *            liste des places � r�server
     * @return la liste des places r�serv�es, vide si toutes les places
     *         demand�es n'ont pu �tre r�serv�es
     * @throws SQLException
     *             si une erreur survient lors de la manipulation des donn�es
     */
    List<Place> reserverPlaces(Representation representation, List<Place> places) throws SQLException;
}
