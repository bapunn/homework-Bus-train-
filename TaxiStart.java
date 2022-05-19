package publictransport;

public class TaxiStart {
    public static void main(String[] args){
        Taxi taxi1 = new Taxi(1);
        taxi1.state = "일반";
        taxi1.takeTaxi();
        taxi1.takeTaxi();
        taxi1.purChase(100);
        taxi1.takeTaxi();
        taxi1.purChase(100);
        taxi1.takeTaxi();
        taxi1.purChase(100);
        taxi1.purChase(100);
        taxi1.takeTaxi();
        taxi1.showInfo();


        Taxi taxi2 = new Taxi(2);
        taxi2.state = "일반";
        taxi2.takeTaxi();
        taxi2.takeTaxi();
        taxi2.purChase(100);
        taxi2.shift(50);


        taxi2.showInfo();
    }
}
