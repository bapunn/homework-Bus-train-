package publictransport;

    public class BusStart {
        public static void main(String[] args){
        Bus bus100 = new Bus(100);
        bus100.state = "운행";

        bus100.takeBus(21);
        bus100.oiling(10);
        bus100.oiling(-17);
        bus100.driving();
        bus100.Shift(-20);
        bus100.togarrage();
        bus100.driving();
        bus100.takeBus(10);
        bus100.driving();
        bus100.oiling(7);
        bus100.driving();
        bus100.takeBus(21);
        bus100.takeBus(21);
        bus100.showInfo();


    }
}

