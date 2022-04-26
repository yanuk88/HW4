public class Main {
    public static void main(String[] args) {
        //exercise 1

        int i = 1;
        while (i <= 10)
            System.out.print(i++ + " " );
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //exercise 2
        int friday = 6;
        while (friday <= 31) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчёт");
            friday = friday + 7;
            }

        //exercise 3
        int currentYear = 2022;
        for (int year = currentYear - 200; year < currentYear + 100 ; year = year + 1) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }



            }
        }




