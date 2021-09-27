package exercises.chapterfive;

public class Exercise_5_5 {
    public static void main(String[] args) {
        double kilogramsLeftside, kilogramsRightside, poundsLeftside, poundsRightSide;

        System.out.println("Kilograms     Pounds | Pounds   Kilograms");

        for (int i = 1; i <= 200; i += 2) {
            kilogramsLeftside = i;
            poundsRightSide = 20 + i / 2 * 5;
            poundsLeftside = kilogramsLeftside * 2.2;
            kilogramsRightside = poundsRightSide / 2.2;
            System.out.printf("%-3.0f%17.3f | %-3.0f%17.3f\n", kilogramsLeftside, poundsLeftside, poundsRightSide,
                    kilogramsRightside);
        }
    }
}