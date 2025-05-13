public abstract class Societe {
    public void ajouteVehicule() {
    }

    /**
     * Ajoute une filiale à la société.
     * @param societe1
     *
     * @return boolean
     */
    public void ajouteFiliale(Societe societe1) {
        if (societe1 != null) {
            System.out.println("La filiale a été ajoutée avec succès.");
        } else {
            System.out.println("Erreur : la filiale n'a pas pu être ajoutée.");

        }
    }

    public String calculeCoutEntretien() {
        return "Coût d'entretien de la société";
    }
}
