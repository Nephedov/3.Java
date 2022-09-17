public class Main {
    public static void main(String[] args) {

        int account = 100;
        int replenishment = 100;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        System.out.println(account + replenishment + bonus);

    }
}