package ch1;

public class LgTv implements Tv {

    // 멤버 변수 초기화
    private BritzSpeaker britzSpeaker;

    @Override
    public void powerOn() {
        System.out.println("LgTv - 전원 On");
    }

    @Override
    public void powerOff() {
        System.out.println("LgTv - 전원 Off");
    }

    @Override
    public void volumeUp() {
        // System.out.println("LgTv - volume up");
        britzSpeaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        // System.out.println("LgTv - volume down");
        britzSpeaker.volumeDown();
    }
}
