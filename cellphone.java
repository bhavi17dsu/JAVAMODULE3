public class Main {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        phone.ring();
        phone.vibrate();
        phone.callFriend();
    }
}
class Cellphone {
    public void ring() {
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
    public void callFriend() {
        System.out.println("Calling friend...");
    }
}
