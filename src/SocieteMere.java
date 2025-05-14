import java.util.*;

public class SocieteMere extends Societe {
    private List<Societe> filiales = new ArrayList<>();

    @Override
    public boolean ajouteFiliale(Societe s) {
        if (s != null) {
            filiales.add(s);
            return true;
        }
        return false;
    }

    @Override
    public int calculeCoutEntretien() {
        int total = nbVehicules * 5;            // coût de la société mère
        for (Societe filiale : filiales) {
            total += filiale.calculeCoutEntretien();
        }
        return total;
    }
}
