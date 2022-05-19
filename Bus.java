package publictransport;
public class Bus {
    int passenger;     //승객탑승인원
    int Max_Passenger = 10; //최대탑승인원
    int intake = 0;   //수입
    int busNum;      //버스번호
    int fuel = 11;        //연료
    int speed = 60;       //속도
    String state;       //운행
    public Bus(int num) {
        this.busNum = num;//버스번호매김
    }

    public void takeBus(int passenger) {// 승객 탑승
        for (int i = 0; i < passenger; i++) {
            if (this.passenger < Max_Passenger && this.state.equals("운행")) {
                this.passenger++;//승객
                this.intake += 1300;//수입}
            }
        }
            if(this.passenger==Max_Passenger&&this.state.equals("운행")){
                System.out.println("만석입니다.");
            }
                }

    public void driving() {//운행
        if(this.fuel>=10&&this.state.equals("차고지행")){
            this.state ="운행";
        }
        if(this.state.equals("운행")) {
            this.fuel--;
        }
        if (fuel < 10&&this.state.equals("운행")) {
            System.out.println("주유가필요합니다.");
        }
        if (fuel < 1||this.state.equals("차고지행")) {
            this.speed = 0;
            System.out.println("운행불가.");
            this.state = "차고지행";
            this.passenger = 0;
        }

    }
    public void Shift(int speed) {
        if (this.state.equals("운행") && this.fuel>=10) {
            System.out.println("경고!!!"+" 연료확인 :"+fuel);
            this.speed += speed;

        }else{
            System.out.println("변속할수없습니다");
        }
    }
    public void togarrage() {
        this.speed = 0;
        this.state = "차고지행";
        this.passenger = 0;
       }


    public void oiling(int num) {
        this.fuel += num;
    }


    public int getIntake(){
        return intake;
    }
    public int getPassenger(){
        return passenger;
    }
    public int getFuel(){
        return fuel;
    }
    public int getSpeed(){
        return speed;
    }
    public void showInfo() {
        System.out.println(+busNum+"번 버스"+" 현재상태:"+this.state+"  수입:"+this.getIntake()+"  승객: "+this.getPassenger()+"  연료: " +this.getFuel()+" 속도: "+this.speed);

    }
}
