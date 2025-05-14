public abstract class Societe {
    protected int nbVehicules = 0;

    public void ajouteVehicule() {
        nbVehicules++;
    }

    public abstract boolean ajouteFiliale(Societe s);

    public abstract int calculeCoutEntretien();
}
