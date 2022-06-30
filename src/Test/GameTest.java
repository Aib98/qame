package Test;


public class GameTest {
    // 1. Проверка на ничью
    // 2. Проверка на отрицательное значения
    // 3. Проверка на значения от 1 до 6

//    private final Game Dice = new Game;

    public void testGameEgualResult (){
        String scenario = "Тест на ничью";
        try {
            String expected = "Ничья";
//            int actual =



            System.out.println(scenario);

        } catch (Throwable e) {
            System.err.println("fails with message " + scenario + e.getMessage());
        }
    }

    public void testGameRangeOfValues (){
        String scenario = "Тест на значения от 1 до 6";
        try {
            String expected = "Ничья";

            System.out.println(scenario);
        } catch (Throwable e) {
            System.out.println("fails with message " + scenario + e.getMessage());
            }
        }


}
