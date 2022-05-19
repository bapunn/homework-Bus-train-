package publictransport;

public class Taxi {
    int taxiNUm;
    int fuel = 12;
    int speed = 60;
    int basicRange = 30 ;//기본거리
    int range;//목적지까지 거리
    int basicIntake = 3500;//기본요금
    int addIntake = 120;//거리당 추가요금
    int purchase;
    int inTake;

    String state;//상태

    public Taxi(int num) {
        this.taxiNUm = num;//택시번호매김
    }


    public void takeTaxi() {
        if (this.fuel >= 10 && this.state.equals("일반")) {
            System.out.println("연료량: "+this.fuel +" 운행 가능");
            this.state = "운행중";
            this.fuel--;
        }else {
            System.out.println("탑승 불가 합니다");
        }
    }
    public void purChase(int range){
        purchase = (this.basicIntake + ((range - this.basicRange) * this.addIntake));
        if(range>=this.basicRange&&this.state.equals("운행중")){
            this.inTake += purchase ;
        }else if(range<this.basicRange&&this.state.equals("운행중")){
            this.inTake += this.basicIntake;
        }
        System.out.println("요금은 "+(purchase)+" 입니다");
        if (this.state.equals("운행중"));{
            this.state = "일반";
        }
;

    }
    public void shift(int speed) {
        System.out.println(speed+" 만큼 가속");
        this.speed += speed;
        }

    public int getIntake(){
        return inTake;
    }
    public int getSpeed(){
        return speed;
    }
    public int getFuel(){
        return fuel;
    }

    public void showInfo(){
        System.out.println(this.taxiNUm+"호차 "+"상태:" +this.state+" 요금 :" + this.getIntake()+" 연료: "+this.getFuel()+" 속도:"+this.getSpeed()) ;}
}


