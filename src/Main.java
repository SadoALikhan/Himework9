public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1, 2 и 3");
        int[] expenses = {64544, 66717, 61860, 69341, 61931};
        int sum = 0;
        int expensesMax = expenses[0];
        int expensesMin = expenses[0];
        float averageExpens = 0f;
        for (int i : expenses) {
            sum += i;
        }
        System.out.println("1)Сумма трат за месяц составила " + sum + " рубля.");

        for (int correntExpenses : expenses) {
            if (correntExpenses > expensesMax) {
                expensesMax = correntExpenses;
            } else if (correntExpenses < expensesMin) {
                expensesMin = correntExpenses;
            }
        }
        System.out.println("2)Минимальная сумма трат за неделю составила " + expensesMin +
                " рублей. Максимальная сумма трат за неделю составила " + expensesMax + " рублей");

        averageExpens = (float) sum / expenses.length;
        System.out.println("3)Средняя сумма трат за месяц составила " + averageExpens + " рублей");

        System.out.println("Задача 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}