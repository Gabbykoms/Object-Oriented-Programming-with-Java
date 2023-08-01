import java.util.ArrayList;
import java.util.HashMap;

public class WasteCompany implements IPickUpRequest{

/* A waste company is a company that collects the waste of households and segregates them 
 * and dispose them effectively to prevent improper waste management which has climatic
 * repercussions
 */

    //TO DO: DECLARE THE VARIOUS ATTRIBUTES OF THE CLASS

    private String companyName;
    private String serviceArea;
    private long    mobileContact; 
    private PaymentAccount account;

    ArrayList<Household> customerList;
    HashMap<String, Double> priceList;


    //TO DO: DECLARE THE VARIOUS METHODS FOR THE CLASS
    public WasteCompany(){
                        // this is a default constructor
    }

    public WasteCompany(String name, String area, long phone){
        this.companyName = name;
        this.serviceArea = area;
        this.mobileContact = phone;
        this.customerList = new ArrayList<Household>();
        this.priceList = new HashMap<String, Double>();


    }

    public void setCompanyName(String name){
        this.companyName = name;        //this method allows us to set the name of the company

    }

    public void setServiceArea(String area){
        this.serviceArea = area;        //this method allows us to set the service area of company

    }

    public void setMobileContact(long number){
        this.mobileContact = number;        //this method allows us to set the mobile contact of company

    }

    // public void setPriceList(HashMap<String, Double> prices){
    //     this.priceList = prices;        //utilizes HashMaps to set the prices for each waste collection

    // }


    //TO DO : DEFINE THE VARIOUS ACCESSOR METHODS FOR THE METHODS

    public String getCompanyName(){
        return this.companyName;

    }

    public String getServiceArea(){
        return this.serviceArea;

    }

    public long getMobileContact(){
        return this.mobileContact;

    }

    public String displayCustomers(){
        for (int i = 0; i < customerList.size(); i++){
            System.out.println(customerList.get(i));

        }
        return "true";
    
    }

    public void displayPriceList(){
        for(String i: priceList.keySet()){
            System.out.println("Weight of garbage: " + i + ", price of pick-up: " + priceList.get(i));
        }
    }

    @Override
    public void processRequest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processRequest'");
    }

    





    

}