import java.util.*;

import javax.xml.validation.ValidatorHandler;

public class GreenConnectDemo{
    WasteCompany W1 = new WasteCompany("ZoomLion", "Tamale", 509845687L);

      static ArrayList<WasteCompany> listOfCompanies = new ArrayList<WasteCompany>();
      static HashMap<String, Double> priceList;
      private String companyName;

      public void displayPriceList(){
        for(String i: priceList.keySet()){
            System.out.println("Weight of garbage: " + i + ", price of pick-up: " + priceList.get(i));
        }
    }



    public static void main(String[] args){

        String Greentip = " Remember to safely dispose waste and plant a tree today";
        WasteCompany W1 = new WasteCompany("ZoomLion", "Tamale", 509845687L);
        WasteCompany W2 = new WasteCompany("GrayLion", "Cape Coast", 509833387L);
        WasteCompany W3 = new WasteCompany("PinkLion", "Koforidua", 609845687L);
        WasteCompany W4 = new WasteCompany("TameLion", "Amazon", 509775687L);
        WasteCompany W5 = new WasteCompany();
        WasteCompany W6 = new WasteCompany();

        W2.priceList.put("20kg", 15.0);
        W2.priceList.put("25kg", 30.0);
        W2.priceList.put("5kg", 7.0);

        W1.priceList.put("25kg", 15.0);
        W1.priceList.put("30kg", 30.0);
        W1.priceList.put("7kg", 7.0);

        W3.priceList.put("10kg", 15.0);
        W3.priceList.put("15kg", 30.0);
        W3.priceList.put("9kg", 7.0);

        W4.priceList.put("16kg", 15.0);
        W4.priceList.put("23kg", 30.0);
        W4.priceList.put("7kg", 7.0);

        

        listOfCompanies.add(W1);
        listOfCompanies.add(W2);
        listOfCompanies.add(W3);
        listOfCompanies.add(W4);
        listOfCompanies.add(W5);
        listOfCompanies.add(W6);


        Scanner keyboard = new Scanner(System.in);
        System.out.println("You're welcome Greenconnector!. I hope you're having a wonderful day");
        System.out.println("Would you like to order a garbage pick up today?");


        String answer  = keyboard.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Great!");
            System.out.println("The companies available for pickup in your area today are:");
             for (int i = 0; i < listOfCompanies.size(); i++){
                System.out.println(listOfCompanies.get(i).getCompanyName());

             } 
            }
            
             else{
                System.out.println(Greentip);
                System.exit(0);
            }
            
        System.out.println("The packages of Zoomlion are companies are:");
        W1.displayPriceList();
        System.out.println("The packages of Graylion are companies are:");
        W2.displayPriceList();
        System.out.println("The packages of Pinklion are companies are:");
        W3.displayPriceList();
        System.out.println("The packages of Tamelion are companies are:");
        W4.displayPriceList();
        







        System.out.println("Select a company to make an order");

        String choice = keyboard.next();

        for( int i = 0; i < listOfCompanies.size(); i++){
             if(choice.equalsIgnoreCase(listOfCompanies.get(i).getCompanyName())){
                System.out.println("You successfully selected a waste company");
                System.out.println("The cost of your garbage will be communicated soon");
                System.out.println("Thanks for using GreenConnect");
             }

            }






    }
}
