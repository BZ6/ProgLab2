package Att.Sp;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Aurora_Beam extends SpecialMove {
    public Aurora_Beam() {
        super(Type.ICE, 65, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.ATTACK, -1));
    }

    @Override
    protected String describe() {
        return "Aurora Beam";
    }
}
