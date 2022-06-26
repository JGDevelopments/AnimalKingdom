package AnimalKingdom;


import java.util.Arrays;

import static AnimalKingdom.AirProperties.arialBodies;

public abstract class Bird implements AirProperties, SharedProperties {

    int topSpeed;
    String[] eyeSight = {"Good", "Great", "Superior"};

    public static void main(String[] args) {
        System.out.println("** (Shared) Interface Properties **");
        System.out.println("" +
                "    nonExtinct = "+nonExtinct+"\n" +
                "    animalKingdom = "+animalKingdom +"\n" +
                "    earthInhabitants = "+earthInhabitants+"\n" +
                "    needsFood = "+needsFood+"\n" +
                "    needsSleep = "+needsSleep+"\n"+
                "    needsOxygen = "+needsOxygen+"\n"+
                "    canCommunicate = "+communicate+"\n");
        System.out.println("----------------------------------------------");
        System.out.println("** Interface Properties **");
        System.out.println("" +
                "    Do birds respire = "+respiration+"\n" +
                "    Does a bird fly = "+flyable+"\n" +
                "    Do birds nest = "+nests+"\n" +
                "    Properties of a Birds body = "+ Arrays.toString(arialBodies) + "\n");
        System.out.println("----------------------------------------------");

        Bird eagle = new Eagle();
        Bird hawk = new Hawk();
        Bird parrot = new Parrot();
    }

    public static class Eagle extends Bird{
        public Eagle() {
            topSpeed = 200;

            System.out.println("** (Eagle) Custom Properties **");
            System.out.println("" +
                    "    Eagle top speed = "+topSpeed+"\n" +
                    "    Eagle eyesight = "+eyeSight[2]+"\n" +
                    "    Eagle Intelligence = " + intel[1]);
            System.out.println("---------------------------------------");
        }
    }

    public static class Hawk extends Bird{
        public Hawk() {
            topSpeed = 120;


            System.out.println("** (Hawk) Custom Properties **");
            System.out.println("" +
                    "    Hawk top speed = "+topSpeed+"\n" +
                    "    Hawk eyesight = "+eyeSight[2]+"\n" +
                    "    Hawk Intelligence = " + intel[0]);
            System.out.println("---------------------------------------");
        }
    }

    public static class Parrot extends Bird{
        public Parrot() {
            topSpeed = 55;

            System.out.println("** (Parrot) Custom Properties **");
            System.out.println("" +
                    "    Parrot top speed = "+topSpeed+"\n" +
                    "    Parrot eyesight = "+eyeSight[1]+"\n" +
                    "    Parrot Intelligence = " + intel[2]);
            System.out.println("---------------------------------------");
        }
    }

}
