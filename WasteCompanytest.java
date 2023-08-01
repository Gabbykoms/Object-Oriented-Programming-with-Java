public class WasteCompanytest{
    public static void main(String[] args){

        //TO DO: INSTANTIATE OBJECTS OF THE WASTECOMPANY CLASS
        WasteCompany W1 = new WasteCompany("ZoomLion", "Tamale", 509845687L);
        WasteCompany W2 = new WasteCompany("GrayLion", "Cape Coast", 509833387L);
        WasteCompany W3 = new WasteCompany("PinkLion", "Koforidua", 609845687L);
        WasteCompany W4 = new WasteCompany("TameLion", "Amazon", 509775687L);
        WasteCompany W5 = new WasteCompany();
        WasteCompany W6 = new WasteCompany();


        //TO DO:  TEST THE VARIOUS METHODS CREATED FOR THE WASTECOMPANY CLASS
        W5.setCompanyName("ProVentures");
        W6.setCompanyName("ProBinSol");
        W5.setServiceArea("Agbogbloshie");
        W6.setServiceArea("Odogono");
        W5.setMobileContact(208992124L);
        W6.setMobileContact(340992124L);


        System.out.println(W5.getCompanyName());
        System.out.println(W6.getCompanyName());
        System.out.println(W5.getServiceArea());
        System.out.println(W6.getServiceArea());
        System.out.println(W5.getMobileContact());
        System.out.println(W6.getMobileContact());

         // TO DO: ADD CUSTOMERS TO SELECTED WASTECOMPANIES
         Household h1 = new Household("Accra", "AWS219034", 4);
         Household h4 = new Household("Takoradi", "WPR589034", 2);
         W1.customerList.add(h1);
         W1.customerList.add(h4);
        


        Household h3 = new Household("Somanya", "AWS913502", 3);
        Household h6 = new Household("Takoradi", "WPR360034", 7);
        W2.customerList.add(h3);
        W2.customerList.add(h6);

        //TESTING THE DISPLAYCUSTOMERS METHOD
        System.out.println("The list of customers for company W1 are");
        W1.displayCustomers();

        System.out.println("The list of customers for company W2 are");
        W2.displayCustomers();

        //ADDING PRICE LISTS TO THE COMPANIES AND DISPLAYING THEM
        W1.priceList.put("12kg", 12.0);
        W1.priceList.put("20kg", 16.0);
        System.out.println("The price list for company W1 is listed below");
        W1.displayPriceList();

        W2.priceList.put("20kg", 15.0);
        W2.priceList.put("25kg", 30.0);
        W2.priceList.put("5kg", 7.0);
        System.out.println("The price list for company W1 is listed below");
        W2.displayPriceList();












    }
}