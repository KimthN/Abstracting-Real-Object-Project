/**
 * This class represents a simple Airline object with a name.
 * 
 * @author Kim Nguyen
 */
 
public class Airline {
    //instance variable
    private String airline_name;
    
    //default constructor
    /**
     * Constructs an Airline object
     * @param - String name
     */
     
    public Airline(String name){
        airline_name = name;
    }
    
    /**
     * Returns the String name of the airline object.
     * Preconditions: Airline object must be initialized.
     * Postconditions: Returns String name from the airline object.
     * 
     * @return name - the name of the airline
     */

    public String getName(){
        return airline_name;
    }
    
    /**
     * Returns the user-set name of the airline object.
     * Preconditions: Airline object must be initialized.
     * Postconditions: Returns the user-set name of the airlie object.
     * 
     * @param - String new_name
     * @return name - the user-set name of the object
     */
     
    public String setName(String new_name){
        airline_name = new_name;
        return airline_name;
    }
}