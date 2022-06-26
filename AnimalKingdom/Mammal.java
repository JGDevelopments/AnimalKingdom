package AnimalKingdom;

public abstract class Mammal implements LandProperties, SharedProperties{

    public static void main(String[] args) {
        System.out.println("** (Shared) Interface Properties **");
        System.out.println("" +
                "    nonExtinct = "+nonExtinct+"\n" +
                "    animalKingdom = "+animalKingdom +"\n" +
                "    earthInhabitants = "+earthInhabitants+"\n" +
                "    needsFood = "+needsFood+"\n" +
                "    needsSleep = "+needsSleep+"\n"+
                "    needsOxygen = "+needsOxygen+"\n"+
                "    needsOxygen = "+communicate+"\n");
        System.out.println("----------------------------------------------");
        System.out.println("** (Land) Interface Properties **");
        System.out.println();
        System.out.println("----------------------------------------------");
    }
    public class Human extends Mammal{
        public Human() {
            System.out.println("** (Human) Custom Properties **");
            System.out.println();
            System.out.println("---------------------------------------");
        }
    }

    public class Bear extends Mammal{
        public Bear() {
            System.out.println("** (Bear) Custom Properties **");
            System.out.println();
            System.out.println("---------------------------------------");
        }
    }

    public class Dog extends Mammal{
        public Dog() {
            System.out.println("** (Dog) Custom Properties **");
            System.out.println();
            System.out.println("---------------------------------------");
        }
    }
}
