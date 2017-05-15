
class RoundingNumbers {
            double x, y;

            public void setOprands(double x){
                this.x = x;
                this.y = y;
            }

            public void round_dec01(){
                this.y = Math.floor(this.x*10 +0.5)/10;
                System.out.println(this.y);
            }

            public void round_dec02(){
                this.y = Math.floor(this.x*100 + 0.5)/100;
                System.out.println(this.y);
            }
    }

public class Ch6_RoundingCalculator {

    public static void main(String[] args) {

        RoundingNumbers r1 = new RoundingNumbers();
        r1.setOprands(139.43);
        r1.round_dec01();
        r1.round_dec02();

        RoundingNumbers r2 = new RoundingNumbers();
        r2.setOprands(4.666666);
        r2.round_dec01();
        r2.round_dec02();

    }
}