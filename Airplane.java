public class Airplane {
    private Airline airline_name;
    private String destination;
    private String departure;
    private int duration;
    private int gate;
    private int passengers;
    
    // custom constructor
    /**
     * Constructs an airplane object
     * @param String destintion1
     * @param String departure1
     * @param int duration1
     * @param int gate1
     * @param int passengers1
     */
    public Airplane(Airline airline_name1, String destination1, String departure1, int duration1, int gate1, int passengers1){
        airline_name = airline_name1;
        destination = destination1;
        departure = departure1;
        duration = duration1;
        gate = gate1;
        passengers = passengers1;
    }
    
    //overloaded constructor
    /**
     * Constructs airplane object with default destination, departure, duration, gate, passengers
     * @param Airline airline_name
     * 
     */
    public Airplane(Airline airline_name1){
        airline_name = airline_name1;
        destination = "JFK";
        departure = "SAN";
        duration = 8;
        gate = 27;
        passengers = 100;
    }
    
    //getters
    /** 
     * Accesses Airline name
     * @return airline_name - the String name of airline
     */
    public Airline getAirline(){
        return airline_name;
    }
    
    /**
     * Accesses destination
     * @return String destination
     */
    public String getDestination(){
        return destination;
    }
    
    /** 
     * Accesses departure
     * @return String departure
     */
    public String getDeparture(){
        return departure;
    }
    
    /** 
     * Accesses duration
     * @return int duration
     */
    public int getDuration(){
        return duration;
    }

    /**
     * Accesses gate
     * @return int gate
     */
    public int getGate(){
        return gate;
    }
    
    /**
     * Accesses passengers
     * @return int passengers
     */
    public int getPassengers(){
        return passengers;
    }
    
    //setters
    /**
     * Mutates Airline name
     * @param Airline what_airline
     */
    public void setAirline(Airline what_airline){
        airline_name = what_airline;
    }
    
    /** 
     * Mutates destination
     * @param String what_destination
     */
    public void setDestination(String what_destination){
        destination = what_destination;
    }
    
    /**
     * Mutates departure
     * @param String what_departure
     */
    public void setDeparture(String what_departure){
        departure = what_departure;
    }
    
    /** Mutates duration
     * @param int what_duration
     */
    public void setDuration(int what_duration){
        duration = what_duration;
    }
    
    /** 
     * Mutates gate
     * @param int what_gate
     */
    public void setGate(int what_gate){
        gate = what_gate;
    }
    
    /** 
     * Mutates passengers
     * @param int what_paasenters
     */
    public void setPassengers(int what_passengers){
        passengers = what_passengers;
    }
    //methods
    /**
     * Changes the duration of flight by adding the delay_time
     * @param int delay_time
     * @return duration
     * 
     */
    public int flight_delay(int delay_time){
        duration += delay_time;
        return duration;
    }
    
    /**
     * Announces that the initial gate has changed to changed_gate
     * @param int changed_gate
     * @return String
     */
    public String gate_change(int changed_gate){
        return "The flight for gate " + gate + " has changed to gate " + changed_gate + " .";
    }
    
    /**
     * Creates detour to LAX
     */
    public void detour(){
        duration += 80;
        destination = "LAX";
        
    }
    
    /**
     * Creates airplane crash in some randomg field in the midwest, no survivors
     */
    public void crash(){
        passengers = 0;
        destination = "some random field in the midwest";
    }
    
    //to string method
    /**
     * Describes airplane with airline, destination, departure, duration, gate and passengers
     */
    public String toString(){
        return "You are going on vacation! This airplane is a " + airline_name.getName() + " plane! It is departing from " + departure + " and arriving at " + destination + ". This fight is " + duration + "hours and its corresponding gate number is " + gate + ". There are " + passengers + " passengers on this flight.";
    }
}
