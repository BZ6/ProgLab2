package Att.St;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Tickle extends StatusMove {
    public Tickle() {
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(1).turns(-1).stat(Stat.ATTACK, -1));
        pokemon.addEffect(new Effect().chance(1).turns(-1).stat(Stat.DEFENSE, -1));
    }

    @Override
    protected String describe() {
        return "Tickle";
    }
}
