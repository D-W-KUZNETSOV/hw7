public class Main {
    public static void main(String[] args) {
        //Задание№1
        int salary = 15000;
        int total = 0;
        int mount = 0;
        while (total <= 2_459_000) {
            mount = (mount + 1);
            total = total + salary;
            System.out.println("месяц " + mount + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        //задание№2
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a );
        }
        System.out.println();
        for (a = 10; a >= 1; a = a - 1) {
            System.out.print(" " + a );
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
        System.out.println();

        //Задание№4
        float total1 = 15000;
        int mount1 = 0;
        while (total1 < 12_000_000) {
            mount1 = mount1 + 1;
            float persent = (total1 * 7) / 100;
            total1 = total1 + persent;

            System.out.println("месяц " + mount1 + " сумма " + String.format("%.2f", total1));
        }
        System.out.println();

        //Задача№5

        float total2 = 15000;
        for (int mount2 = 1; total2 < 12_000_000; mount2++) {
            float persent = (total2 * 7) / 100;
            total2 = total2 + persent;
            if (mount2 % 6 == 0)


                System.out.println("месяц " + mount2 + " сумма " + String.format("%.2f", total2));
        }
        System.out.println();

        //Задача№6
        float total3 = 15000;
        for (int mount3 = 1; mount3 <= 108; mount3++) {//9лет=108месяцев
            float persent2 = (total3 * 7) / 100;
            total3 = total3 + persent2;
            if (mount3 % 6 == 0) {
                System.out.println("месяц " + mount3 + " сумма " + String.format("%.2f", total3));
            }
        }
        System.out.println();

        //Задача№7
        int friDay = 3;
        do {
            System.out.println("сегодня пятница " + friDay + "-ечисло.Необходимо подготовить отчёт");
            friDay += 7;
        } while (friDay < 31);

        System.out.println("сегодня пятница " + friDay + "-ечисло.Необходимо подготовить отчёт");

        System.out.println();

        //Задача№8
        int year4 = 0;
        int interval = 79;
        int totalYear = 1824;
        int laterYear = 2124;
        for (year4 = 0; year4 <= laterYear; ) {
            year4 += interval;
            if (laterYear > year4 && year4 > totalYear) {
                System.out.println(""+ year4 +"");
            }


        }
    }
}





