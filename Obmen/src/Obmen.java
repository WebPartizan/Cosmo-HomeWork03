public class Obmen {
    public static double toUSD (int rub, double course){
         return rub * course;
    }

    public static void main(String[] args) {
        System.out.println(toUSD(700, 1.6469));
    }
}
