public class Tester
{
    public static void main(String[] args)
    {
        Airline airline1test = new Airline("Spirit");
        Airplane airplane1 = new Airplane(airline1test, "ATL", "SFO", 5, 3, 150);
        System.out.println(airplane1);
        
        Airline airline2test = new Airline("Delta");
        Airplane airplane2 = new Airplane(airline2test);
        System.out.println(airplane2);
        
        System.out.println("There has been a " + airplane1.flight_delay(3) + " hour delay.";
        airplane1.detour();
        System.out.println(airplane2.gate_change(12);
        airplane2.crash();
    }
}
