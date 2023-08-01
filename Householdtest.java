public class Householdtest{
    public static void main(String[] args){

        // TO DO: INSTANTIATE OBJECTS OF THE HOUSEHOLD CLASS
        Household h1 = new Household("Accra", "AWS219034", 4);
        Household h2 = new Household("Kumasi", "AKT230952", 5);
        Household h3 = new Household("Somanya", "AWS913502", 3);
        Household h4 = new Household("Takoradi", "WPR589034", 2);
        Household h5 = new Household();
        Household h6 = new Household("Takoradi", "WPR360034", 7);
        Household h7 = new Household();

        // TO DO: TEST THE ACCESSOR METHODS OF THE HOUSEHOLD CLASS
        System.out.println(h1.getTown());
        System.out.println(h2.getTown());
        System.out.println(h3.getTown());
        System.out.println(h4.getTown());

        // TO DO:  TESTING THE MUTATOR METHODS
        
        h1.setTown("kuma");
        h2.setTown("Buduburam");
        h3.setTown("Anyinase");
        h1.setTown("Koforidua");

        System.out.println(h1.getTown());
        System.out.println(h2.getTown());
        
        h1.setAddress("ASW234908");
        h2.setAddress("ECQ143256");

        h3.setNumPeople(8);
        h4.setNumPeople(12);
        System.out.println(h3.getNumPeople());
        System.out.println(h4.getNumPeople());
        

        









    }
}