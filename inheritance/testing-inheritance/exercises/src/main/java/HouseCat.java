import org.w3c.dom.ls.LSOutput;
import static java.lang.System.*;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(String aName) {
        name = aName;
    }

    public HouseCat tonyTheTiger = new HouseCat("Tony the Tiger", 345);
    tonyTheTiger.eat();
    System.out.printIn(tonyTheTiger.isTired());

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}