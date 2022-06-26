package AnimalKingdom;



public abstract class Fish implements AquaticProperties, SharedProperties{
    boolean hasScales;
    boolean isMammal;

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
        System.out.println("** (Aquatic) Interface Properties **");
        System.out.println("I can Swim: " + swimmable+ " \n" + "I undergo Aquatic Respiration: " +aquaRespiration + "\n");
        System.out.println("----------------------------------------------");

        Fish salmon = new Salmon();
        Fish goldfish = new Goldfish();
        Fish dolphin = new Dolphin();


    }

    public static class Salmon extends Fish{


        public Salmon(){
            hasScales = true;

//            System.out.println("Salmon Constructor has been called ");
            System.out.println("** (Salmon) Custom Properties **");
            System.out.println("Do I have scales: " + hasScales +"\n" + "Intelligence: " + intel[1]);
            System.out.println("---------------------------------------");
        }
    }

    public static class Goldfish extends Fish{
        public Goldfish(){
            hasScales = true;

//            System.out.println("Goldfish Constructor has been called ");
            System.out.println("** (Goldfish) Custom Properties **");
            System.out.println("Do I have scales: " + hasScales +"\n" + "Intelligence: " + intel[0]);
            System.out.println("---------------------------------------");

        }

    }

    public static class Dolphin extends Fish{

        public Dolphin() {
            hasScales = false;
            isMammal = true;
            boolean echoLocate = true;

//            System.out.println("Dolphin Constructor has been called ");
            System.out.println("** (Dolphin) Custom Properties **");
            System.out.println("Do I have scales: " + hasScales +"\n" + "Intelligence: " + intel[2] + "\n" + "Echolocation : " + echoLocate);
            System.out.println("---------------------------------------");
        }
    }

}
