package Assignments.What_is_object_assgn1;

public class Plant {
    // Charecteristics
    static String name;
    int age;
    String origin;
    boolean sun;

    Leaf leaf = new Leaf();
    Flower flower = new Flower();
    Root root = new Root();

    //Behavior

    public void givefood()
        {
            System.out.println("Here take some "+ name + "'s Fruits");
        }

    public void giveoxygen()
    {
        System.out.println("Enjoy the freshly produced Oxygen");
    }
    public void sunlight() {
        Root.getwater();
        System.out.println("H2O---->0o0o0o0o0----->>---->>>----<+>|<+> ");
        Leaf.photosynthesis();
        System.out.println("Here you go");
        giveoxygen();
    }
    public void relax() {
        givefood();
        System.out.println("   ");
        Flower.givesmell();
    }
}
