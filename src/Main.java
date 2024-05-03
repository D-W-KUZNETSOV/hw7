public class Main {
    public static void main(String[] args) {
        //Задание№1
        int salary = 15000;
        float total = 0;
        int mount = 0;
        int totalFinish = 2_459_000;
        while (total <= totalFinish) {
            mount = (mount + 1);
            total = total + (total / 100);
            total = total + salary;
            System.out.println("месяц " + mount + " сумма накоплений равна " + String.format("%.2f", total) + " рублей");
        }
        //задание№2
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a);
        }
        System.out.println();
        for (a = 10; a >= 1; a = a - 1) {
            System.out.print(" " + a);
        }
        System.out.println();
        //задание№3
        int birthRate = 17;//на1000человек
        int mortalRate = 8;//на1000человек
        int totalRate;
        int populationSize = 12_000_000;
        totalRate = (birthRate - mortalRate);
        int yearTotal = (populationSize * totalRate) / 1000;
        for (int year = 1; year <= 10; year++) {
            populationSize = (populationSize + yearTotal);
            System.out.println("год " + year + " численность населения составляет " + populationSize);
        }
        //Задание№4
        float total1 = 15000;
        int mount1 = 0;
        int summa = 12_000_000;
        float persent1 = 7;
        while (total1 < summa) {
            mount1 = mount1 + 1;
            total1 = total1 + ((total1 * persent1) / 100);

            System.out.println("месяц " + mount1 + " сумма " + String.format("%.2f", total1));
        }
        //Задача№5
        float total2 = 15000;
        int endSumma = 12_000_000;
        int persent = 7;
        for (int mount2 = 1; total2 < endSumma; mount2++) {
            float persent2 = (total2 * persent) / 100;
            total2 = total2 + persent2;
            if (mount2 % 6 == 0)
                System.out.println("месяц " + mount2 + " сумма " + String.format("%.2f", total2));
        }
        //Задача№6
        float total3 = 15000;
        int persent5 = 7;
        int nineYears = 108;//9лет=108месяцев
        for (int mount3 = 1; mount3 <= nineYears; mount3++) {
            float persent3 = (total3 * persent5) / 100;
            total3 = total3 + persent3;
            if (mount3 % 6 == 0) {
                System.out.println("месяц " + mount3 + " сумма " + String.format("%.2f", total3));
            }
        }
        //Задача№7
        int friDay = 3;
        int week = 7;
        int fullMount = 31;
        do {
            System.out.println("сегодня пятница " + friDay + "-ечисло.Необходимо подготовить отчёт");
            friDay += week;
        } while (friDay < fullMount);
        System.out.println("сегодня пятница " + friDay + "-ечисло.Необходимо подготовить отчёт");
        //Задача№8
        int year4 = 0;
        int interval = 79;
        int totalYear = 1824;
        int laterYear = 2124;
        for (year4 = 0; year4 <= laterYear; ) {
            year4 += interval;
            if (laterYear > year4 && year4 > totalYear) {
                System.out.println("" + year4);
            }
        }
    }
}





