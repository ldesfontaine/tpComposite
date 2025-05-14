public class SocieteSansFiliale extends Societe {

    @Override
    public boolean ajouteFiliale(Societe s) {
        return false;
    }

    @Override
    public int calculeCoutEntretien() {
        return nbVehicules * 5;
    }
}
