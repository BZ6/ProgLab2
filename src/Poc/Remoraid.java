package Poc;

import Att.Sp.Aurora_Beam;
import Att.Sp.Psychic;
import Att.Sp.Water_Gun;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Remoraid extends Pokemon {
    public Remoraid() {
        setType(Type.WATER);
        setStats(75, 105, 75,105,75,45);
        addMove(new Aurora_Beam());
        addMove(new Psychic());
        addMove(new Water_Gun());
    }
}
