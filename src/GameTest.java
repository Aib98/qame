public class GameTest {
    // 1. Проверка на ничью
    // 2. Проверка на отрицательное значения
    // 3. Проверка на значения от 1 до 6

//    private final Game Dice = new Game;

    public void testGameEgualResult() {
        String scenario = "Тест на ничью";
        System.out.println(scenario);

        Player alex = new Player("Alex");
        Player oleg = new Player("Oleg");
        Dice dice = new DiceTest();

        Game game = new Game(dice, new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                if (winner == null) {
                    System.out.println("Тест пройден" + '\n');
                }
                else {
                    System.out.println("Тест не пройден" + '\n');
                }
            }
        });

        game.playGame(alex, oleg);
    }

    public void testGameRangeOfValues() {
        String scenario = "Тест на значения от 1 до 6";
        System.out.println(scenario);
        Dice dice = new DiceImpl();

        boolean check = true;
        for (int i = 0; i < 100; i++) {
            int value = dice.roll();
            if (value < 1 || value > 6) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Тест пройден" + '\n');
        }
        else {
            System.out.println("Тест не пройден" + '\n');
        }
    }

    public void testDiceNegativeValue() {
        String scenario = "Тест на отрицательные значения кубика";
        System.out.println(scenario);
        Dice dice = new DiceImpl();

        boolean check = true;
        for (int i = 0; i < 100; i++) {
            int value = dice.roll();
            if (value < 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Тест пройден" + '\n');
        }
        else {
            System.out.println("Тест не пройден" + '\n');
        }
    }

    public void testPlayerConstructor() {
        String scenario = "Тест на конструктор игрока";
        System.out.println(scenario);

        String name = "Alex";
        Player player = new Player(name);

        if (player.getName().equals(name)) {
            System.out.println("Тест пройден" + '\n');
        }
        else {
            System.out.println("Тест не пройден" + '\n');
        }
    }
}
