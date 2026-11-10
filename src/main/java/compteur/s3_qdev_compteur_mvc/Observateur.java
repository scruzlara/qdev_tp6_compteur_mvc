package compteur.s3_qdev_compteur_mvc;

/**
 * Interface pour les differents observateurs de compteur.Sujet
 */
public interface Observateur {
    public void actualiser(Sujet s);
}
