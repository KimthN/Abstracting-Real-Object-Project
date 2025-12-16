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
        
        airplane1.halfway_there("DFW", 7);
        airplane1.detour();
        airplane2.depart(8);
        airplane2.crash();
    }
}