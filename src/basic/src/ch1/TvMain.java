package ch1;

public class TvMain {
    public static void main(String[] args) {
        // tv 객체 생성
        // LgTv lgTv = new LgTv();
        // SamsungTv samsungTv = new SamsungTv();

        Tv tv = new LgTv();

        tv.powerOn();
        // NullPointerException
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();

    }
}
