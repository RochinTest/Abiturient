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

    private String[] str = new String[7];
    String str1;


    public Main() {
    }



    public static void main(String[] args) {







        Main person = new Main();
        Abiturient person1 = new Abiturient();


        Double exRating = person1.getExRating();

        // Double exRating = person1.getExRating();
        person1.setExRating(exRating);

        String Patronymic = person1.getPatronymic();
        person1.setPatronymic(Patronymic);
        String Address = person1.getAddress();
        person1.setAddress(Address);
        String Telephone = person1.getTelephone();
        person1.setTelephone(Telephone);
        String ratings = person1.getRatings();
        person1.setRatings(ratings);
        String FirstName = person1.getFirstName();
        person1.setFirstName(FirstName);
        String LastName = person1.getLastName();
        person1.setLastName(LastName);
        int Id = person1.getId();
        person1.setId(Id);

        person1.initArray();
        person.averageRating(person1);
        // person.test(person1);
       // person.excellentAbiturient(person1);
        // person.sortArray(person1);

        // person.badRatings(person1);
        // person.show(person1);

    }

    private static List<Abiturient>  makeAbiturient(Abiturient abiturient){
        List<Abiturient> abiturients= new LinkedList<Abiturient>();
        abiturients.add(new Abiturient("Сидоров","Петр","Витальевич","ул.Крапоткина",345345,3+ 4+ 5 +3 +7+ 8+ 2, 4.57));
        abiturients.add(new Abiturient("Брундуков"," Артем","Александрович"," ул.Давида",6785454, 4 +2+ 3+ 9 +5 +4 +9,5.14));
        abiturients.add(new Abiturient("Голотовский","Никита","Владимирович","ул.Лебедя",5455667,9 +2+ 3+ 4 +1 +4 +6,4.14));
        abiturients.add(new Abiturient("Верещако","Владислав","Максимович","ул.Крапоткина",893434,2 +3+ 5+ 2+ 9 +3 +5,4.14));
        abiturients.add(new Abiturient("Добринская","Дарья","Дмитриевна","ул.Сепаратистов",233568,9+ 8+ 7 +5+ 6 +7+ 4,6.57));
        abiturients.add(new Abiturient("Жуковин","Леонид","Вячеславович"," ул.Давида",9783242,9 +2+ 3+ 4 +1 +4 +6,4.14));
        abiturients.add(new Abiturient("Верещако","Владислав","Вячеславович","ул.Лебедя",5455667,4 +5+ 7+ 8+ 4+ 5+ 6,5.57));
        abiturients.add(new Abiturient("Зуева","Вероника","Вячеславовна","ул.Опереты",6797833,5 +6+ 4+ 5+ 6+ 4+ 9,5.57));
        abiturients.add(new Abiturient("Иванченков","Артур","Андреевич","ул.Крапоткина",345345,5 +6+ 5+ 6+ 8+ 5+ 6,5.85));
        abiturients.add(new Abiturient("Игнатович","Диана","Вячеславович","ул.Лебедя",780978235,4 +5+ 5+ 7+ 5+ 6+ 8,5.58));
        abiturients.add(new Abiturient("Казаченок","Галина","Валерьевна","ул.Красина",345343, 5+ 4+ 5+ 4+ 4+ 5+ 6,4.71));
        abiturients.add(new Abiturient("Коверзюк","Мария","Игоревна","ул.Лебедя",5455667,9 +2+ 3+ 4 +1 +4 +6,4.14));
        abiturients.add(new Abiturient("Козак","Александр","Николаевич","ул.Заграницы",5345345,7+ 8+ 9+ 6+ 7+ 8+ 6,7.28));
        abiturients.add(new Abiturient("Кот","Юлия","Александровна","ул.Павленко",98734534,4+ 5+ 4+ 5+ 6+ 4+ 5,4.71));
        abiturients.add(new Abiturient("Кочеткова","Лилия","Геннадьевна","ул.Космонавтов",567878,4 +5+ 9+ 5+ 6+ 4+ 5,5.42));
        abiturients.add(new Abiturient("Кривецкий","Александр","Александрович","ул.Крапоткина",3343664,5 +5+ 9+ 5+ 6+ 7+ 5,6));
        abiturients.add(new Abiturient("Марчик","Виктория","Леонидовна","ул.Красной Армии",6767866,4 +5+ 9+ 5+ 6+ 4+ 5,5.42));
        abiturients.add(new Abiturient("Мирный","Владислав","Иванович"," ул.Миронова", 2342342,6 +7+ 8+ 6+ 7+ 4+ 5,6.14));
return abiturients;
    }


    private void show(Abiturient person) {
        for (int i = 0; i < 16; i++) {

            person.setId(i);
            System.out.println(person.getLastName() + " " + person.getFirstName() + " " + person.getPatronymic() + " " +
                    person.getAddress() + " " + person.getTelephone() + " " + " " + person.getRatings());

        }
    }

    private void badRatings(Abiturient person) {
        int counter = 17;
        for (int j = 0; j <= 16; j++) {
            for (int i = 0; i < str.length; i++) {
                person.setId(j);
                str = person.getRatings().split(" ");
                if (Integer.parseInt(str[i]) <= 2 && counter != j) {
                    counter = j;
                    System.out.println(person.getLastName() + " " + person.getFirstName() + " " + person.getRatings());
                }
            }
        }
    }

    private void averageRating(Abiturient person) {
        str1 = "";
        System.out.println("Введите средний бал");
        double n = inputDouble();
        DecimalFormat count = new DecimalFormat("#0.00");
        double counter;
        for (int j = 0; j < 17; ++j) {
            counter = 0;
            counter = getCounter(person, j, counter);
            if ((counter / str.length) > n) {
                str1 = str1 + (person.getId()) + " ; ";
                System.out.println(person.getLastName() + " " + person.getFirstName() + "  средний бал " + count.format(counter / str.length));
            }
        }
    }


    private void sortArray(Abiturient person) {
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17 - 1; j++) {
                if (person.exRating[0][j] < person.exRating[0][j + 1]) {
                    double n = person.exRating[0][j];
                    double n1 = person.exRating[1][j];
                    person.exRating[0][j] = person.exRating[0][j + 1];
                    person.exRating[1][j] = person.exRating[1][j + 1];
                    person.exRating[0][j + 1] = n;
                    person.exRating[1][j + 1] = n1;
                }

            }

        }
    }

    private int inputInt() {
        int num1 = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num1 = sc.nextInt();
        }
        return num1;
    }

    private double inputDouble() {
        double num = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            num = sc.nextDouble();
        }
        return num;
    }

    private void excellentAbiturient(Abiturient person) {
        DecimalFormat count = new DecimalFormat("#0.00");
        String st = "";
        double n2 = 0;
        double n1;
        str1 = "";
        double n = 0;
        int n3 = 0;

        for (int j = 0; j < 17; ++j) {
            double counter = 0;
            counter = getCounter(person, j, counter);

            // person1.setcountRating((double) i);
            n2 = n2 + (counter / str.length);
            // person.setExRating(counter / str.length);
            // excellent[0][j] = "" + (counter / str.length);
            // excellent[1][j] = "" + j;
            person.exRating[0][j] = (counter / str.length);
            person.exRating[1][j] = ((double) j);
        }
        System.out.print("проходной бал =  5,58");
        System.out.println();
        System.out.println("Введите кол-во студентов с балом больше проходного");
        n1 = inputInt();

        sortArray(person);
        // test(person);
        for (int i = 0; i < n1; i++) {
            n = person.exRating[1][i];
            n3 = (int) n;
            person.setId(n3);
            if (person.exRating[0][i] > (5.58)) {
                System.out.println(person.getLastName() + " " + count.format(person.exRating[0][i]));

            }
        }
        n3=0; System.out.println("Осталось одно место с полупроходным балом 5.57, на которое претендуют ");
        for (int i1 = 0; i1 < 17; i1++) {
            person.setId(i1);
            if (person.exRating[0][i1] <= 5.58&&n3<3) {n3++;

                System.out.println( person.getLastName() + "с балом " + count.format(person.exRating[0][i1]));
            }
        }
    }
    private double getCounter(Abiturient person, int j, double counter) {
        person.setId(j);
        str = person.getRatings().split(" ");
        for (int i = 0; i < str.length; i++) {
            counter = (counter + Integer.parseInt(str[i]));
        }
        return counter;
    }


}



