public class SocieteMere extends Societe {
    /**
     * Calcule la somme du coût des filiales et du coûts de la societe mère
     *
     * @return la somme du coût d'entretien + le coût de la société mère
     */
    @Override
    public String calculeCoutEntretien() {
        StringBuilder cout = new StringBuilder();
        for (Societe societe : getFiliales()) {
            cout.append(societe.calculeCoutEntretien()).append("\n");
        }
        cout.append("Coût d'entretien de la société mère");
        return cout.toString();
    }

    /**
     * Ajoute une filiale à la société mère.
     *
     * @param societe1 la filiale à ajouter
     */
    @Override
    public void ajouteFiliale(Societe societe1) {
        if (societe1 != null) {
            super.ajouteFiliale(societe1);
        } else {
            System.out.println("Erreur : la filiale n'a pas pu être ajoutée.");
        }
    }


}
