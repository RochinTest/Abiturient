//1.3). Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
//Создать  массив объектов. Вывести:
//a)	список абитуриентов, имеющих неудовлетворительные оценки;
//b)	список абитуриентов, средний балл у которых выше заданного;
//c)	выбрать заданное число n абитуриентов, имеющих самый высокий
// средний балл (вывести также полный список абитуриентов,
// имеющих полупроходной балл).
package com.example.Abiturient;

import java.text.DecimalFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        List<Abiturient> abiturients = makeAbiturient();
        makeAbiturient();
        // show1(abiturients);
        // counter(abiturients);
        // averageRating(abiturients);
        // person.test(person1);
        excellentAbiturient(abiturients);
       // sortArray(abiturients);

        // badRatings(abiturients);
        // person.show(person1);

    }

    private static List<Abiturient> makeAbiturient() {
        List<Abiturient> abiturients = new LinkedList<>();
        abiturients.add(new Abiturient("Сидоров", "Петр", "Витальевич", "ул.Крапоткина", "345345", "3 +4 +5 +3 +7 +8 +2", null));
        abiturients.add(new Abiturient("Брундуков", " Артем", "Александрович", " ул.Давида", "6785454", "4 +2 +3 +9 +5 +4 +9", null));
        abiturients.add(new Abiturient("Голотовский", "Никита", "Владимирович", "ул.Лебедя", "5455667", "9 +2 +3 +4 +1 +4 +6", null));
        abiturients.add(new Abiturient("Верещако", "Владислав", "Максимович", "ул.Крапоткина", "893434", "2 +3 +5 +2 +9 +3 +5", null));
        abiturients.add(new Abiturient("Добринская", "Дарья", "Дмитриевна", "ул.Сепаратистов", "233568", "9 +8 +7 +5 +6 +7 +4", null));
        abiturients.add(new Abiturient("Жуковин", "Леонид", "Вячеславович", " ул.Давида", "9783242", "9 +2 +3 +4 +1 +4 +6", null));
        abiturients.add(new Abiturient("Верещако", "Владислав", "Вячеславович", "ул.Лебедя", "5455667", "4 +5 +7 +8 +4 +5 +6", null));
        abiturients.add(new Abiturient("Зуева", "Вероника", "Вячеславовна", "ул.Опереты", "6797833", "5 +6 +4 +5 +6 +4 +9", null));
        abiturients.add(new Abiturient("Иванченков", "Артур", "Андреевич", "ул.Крапоткина", "345345", "5 +6 +5 +6 +8 +5 +6", null));
        abiturients.add(new Abiturient("Игнатович", "Диана", "Вячеславович", "ул.Лебедя", "780978235", "4 +5 +5 +7 +5 +6 +8", null));
        abiturients.add(new Abiturient("Казаченок", "Галина", "Валерьевна", "ул.Красина", "345343", "5 +4 +5 +4 +4 +5 +6", null));
        abiturients.add(new Abiturient("Коверзюк", "Мария", "Игоревна", "ул.Лебедя", "5455667", "9 +2 +3 +4 +1 +4 +6", null));
        abiturients.add(new Abiturient("Козак", "Александр", "Николаевич", "ул.Заграницы", "5345345", "7 +8 +9 +6 +7 +8 +6", null));
        abiturients.add(new Abiturient("Кот", "Юлия", "Александровна", "ул.Павленко", "98734534", "4 +5 +4 +5 +6 +4 +5", null));
        abiturients.add(new Abiturient("Кочеткова", "Лилия", "Геннадьевна", "ул.Космонавтов", "567878", "4 +5 +9 +5 +6 +4 +5", null));
        abiturients.add(new Abiturient("Кривецкий", "Александр", "Александрович", "ул.Крапоткина", "3343664", "5 +5 +9 +5 +6 +7 +5", null));
        abiturients.add(new Abiturient("Марчик", "Виктория", "Леонидовна", "ул.Красной Армии", "6767866", "4 +5 +9 +5 +6 +4 +5", null));
        abiturients.add(new Abiturient("Мирный", "Владислав", "Иванович", " ул.Миронова", "2342342", "6 +7 +8 +6 +7 +4 +5", null));
        return abiturients;
    }


    private static void show1(List<Abiturient> abiturients) {
        for (Abiturient abiturient : abiturients) {


            System.out.println(abiturient.getLastName() + " " + abiturient.getFirstName() + " " + abiturient.getPatronymic() + " " +
                    abiturient.getAddress() + " " + abiturient.getTelephone() + " " + " " + abiturient.getRatings());

        }
    }

    private static void badRatings(List<Abiturient> abiturients) {

        String[] str = null;
        for (Abiturient abiturient : abiturients) {
            int counter = 17;
            str = abiturient.getRatings().split(" +");
            for (int i = 0; i < str.length; i++) {
                if (Integer.parseInt(str[i]) <= 2 && counter == 17) {
                    counter--;
                    System.out.println(abiturient.getLastName() + " " + abiturient.getFirstName());
                }
            }

        }
    }


    private static void averageRating(List<Abiturient> abiturients) {
        String[] str = null;
        System.out.println("Введите средний бал");
        double n = inputDouble();
        DecimalFormat count = new DecimalFormat("#0.00");

        for (Abiturient abiturient : abiturients) {
          Float counter= Float.valueOf(abiturient.getExcellentRating());
            if ((counter/ str.length) > n) {

                System.out.println(abiturient.getLastName() + " " + abiturient.getFirstName() + "  средний бал " + count.format(counter / str.length));
            }
        }
    }

    private static void sortArray(List<Abiturient> abiturients) {

        Comparator<Abiturient> comparator = Comparator.comparing(abiturient -> abiturient.getExcellentRating());
        Collections.sort(abiturients, Collections.reverseOrder(comparator));
        for (Abiturient abiturient : abiturients) {
            System.out.println(abiturient.getFirstName() + " " + abiturient.getLastName() + " " + abiturient.getExcellentRating());
        }
    }


    private static int inputInt() {
        int num1 = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num1 = sc.nextInt();
        }
        return num1;
    }

    //
    private static double inputDouble() {
        double num = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            num = sc.nextDouble();
        }
        return num;
    }


    private static void excellentAbiturient(List<Abiturient> abiturients) {
        double n1;
        int n3 = 0;
        System.out.print("проходной бал =  5,58");
        System.out.println();
        System.out.println("Введите кол-во студентов с балом больше проходного");
        n3 = inputInt();
        Comparator<Abiturient> comparator = Comparator.comparing(abiturient -> abiturient.getExcellentRating());
        Collections.sort(abiturients, Collections.reverseOrder(comparator));

        for (Abiturient abiturient : abiturients) {

            n1 = Double.parseDouble(abiturient.getExcellentRating().replaceAll(",", "."));

            if (n1 >= 5.58 && n3 != 0) {
                n3--;

                System.out.println(abiturient.getFirstName() + " " + abiturient.getExcellentRating());
            }
        }

        n3 = 0;
        System.out.println("Осталось одно место с полупроходным балом 5.57, на которое претендуют ");
        for (Abiturient abiturient : abiturients) {

            n1 = Double.parseDouble(abiturient.getExcellentRating().replaceAll(",","."));
            //abiturient.setExcellentRating(count.format(n1));
            if (n1 <= 5.58 && n3 < 3) {
                n3++;

                System.out.println(abiturient.getLastName() + " с балом " + abiturient.getExcellentRating());
            }
        }
    }


}