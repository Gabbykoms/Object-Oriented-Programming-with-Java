

public class Household implements IMakeRequest{
    /* This class includes the specifications 
     * for creating a household that utilizes the waste management system to properly
     * dispose waste in mitigating climate change
     */

     // TO DO: DEFINE THE VARIOUS ATTRIBUTES FOR THE HOUSEHOLD CLASS

     private String townOfHouse;
     private String houseAddress;
     private int    numOfPeople;

     // TO DO: DEFINE CONSTRUCTOR(S) FOR THE CLASS
     public Household(){
                            //this is a default constructor
     }


     public Household(String town, String address, int people){
        this.townOfHouse = town;
        this.houseAddress = address;
        this.numOfPeople = people;
     }

     public String toString(){
        return " The house address is "+this.houseAddress + ", it's located in "+ this.townOfHouse+ " and number of people in this house is " +numOfPeople;
     }


     // TO DO: DEFINE THE VARIOUS MUTATOR METHODS THAT THE CLASS WILL USE

     public void setTown(String town){
        this.townOfHouse = town;            //this method sets the town in which the house is located

     }

    public void setAddress(String address){
        this.houseAddress = address;        //this method sets the address of the house

    }

    public void setNumPeople(int people){
        this.numOfPeople = people;          //this method sets the number of people in the house

    }

    // TO DO: DEFINE THE VARIOUS ACCESSOR METHODS THAT THE CLASS WILL USE

    public String getTown(){
        return this.townOfHouse;            //this method allows us to get the town in which the house is located

    }

    public String getAddress(){
        return this.houseAddress;           //this method allows us to access the house address

    }

    public int getNumPeople(){
        return this.numOfPeople;            //this method allows us get the total people in a household

    }


    @Override
    public void placeRequest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'placeRequest'");
    }
}