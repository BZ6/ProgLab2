import Poc.Alomomola;
import Poc.Bellossom;
import Poc.Gloom;
import Poc.Octillery;
import Poc.Oddish;
import Poc.Remoraid;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {

        Battle b = new Battle();
        Gloom p1 = new Pokemon();

        Pokemon p2 = new Alomomola();
        Pokemon p3 = new Bellossom();
        Pokemon p4 = new Octillery();
        Pokemon p5 = new Oddish();
        Pokemon p6 = new Remoraid();

        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
