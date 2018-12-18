import java.util.Arrays;

public class Calc {
    public static void calculate(double[]crew){
        double [] newcrew = new double[crew.length];
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < crew.length; i++){
            newcrew[i] = crew[i]-(crew[i]*0.07);
            sum1 += crew[i];
            sum2 += newcrew[i];
        }
        System.out.println(Arrays.toString(crew)+ " Изначальный бюджет: " + sum1 + " руб.");
        System.out.println(Arrays.toString(newcrew)+ " Оставшийся бюджет: " + sum2 + " руб.");
        System.out.println("Разница: " + (sum1 - sum2)+ " руб.");

    }


    public static void main(String[] args) {
        double [] crew = {100.0,90.0,80.0,95.0,85.0,75.0};
        calculate(crew);
    }
}
/*Изменять исходный массив не требуется, лучше создать новый.
  Старый массив возможно будет необходим для дальнейших расчетов.
  Тем более, что выделенный объем памяти на старый массив будет "висеть"
  пока неиспользуемую переменную не удалит сборщик мусора.
 */