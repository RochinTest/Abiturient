package com.example.Abiturient;

import java.text.DecimalFormat;

public class Abiturient {

   private int id;
  private   String lastName;
  private   String firstName;
   private String patronymic;
   private String address;
   private String telephone;
   private String ratings;
   private Double excellentRating;
   private Double countRating;
public String[][] abiturient = new String[8][17];
public Double[][] exRating = new Double[2][17];
    public Abiturient() {
    }

     public Double getExRating() {

        excellentRating=(exRating[0][getId()]);
      return excellentRating;
   }

    public void setExRating(Double excellentRating) {
        getId();
        this.excellentRating = excellentRating;
       exRating[0][getId()]=excellentRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        getId();
       lastName = abiturient[1][getId()];
        return lastName;
    }


    public void setLastName(String lastName) {
        lastName = lastName;
        abiturient[1][getId()] = lastName;
    }

    public String getFirstName() {

        firstName = abiturient[2][getId()];
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
        abiturient[3][getId()] = firstName;
    }

    public String getPatronymic() {
        patronymic = abiturient[3][getId()];
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        patronymic = patronymic;
        abiturient[3][getId()]=patronymic;
    }

    public String getAddress() {
        address =abiturient[4][getId()];
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getTelephone() {
        telephone = abiturient[5][getId()];
        return telephone;
    }

    public void setTelephone(String Telephone) {
        Telephone = Telephone;
    }

    public String getRatings() {
        ratings=abiturient[6][getId()];
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
    public void initArray() {
        String fieldId = "0 ; 1 ; 2 ; 3 ; 4 ; 5 ; 6 ; 7 ; 8 ; 9 ; 10 ; 11 ; 12 ; 13 ; 14 ; 15 ; 16 ";
        String fieldLastName = "Сидоров ; Брундуков ; Верещако ; Голотовский ; Добринская  ; Жуковин  ; Зуева ; Иванченков ; Игнатович ; Казаченок ; Коверзюк ; Козак ; Кот ; Кочеткова ; Кривецкий ; Марчик ; Мирный ;";
        String fieldFirstName = "Петр ; Артем ; Владислав ; Никита ; Дарья ; Леонид ; Вероника ; Артур ; Диана ; Галина ; Мария ; Александр ; Юлия ; Лилия ; Александр ; Виктория ; Владислав ; ";
        String fieldPatronymic = "Витальевич ; Александрович ; Вячеславович ; Владимирович ; Дмитриевна ; Максимович ; Вячеславовна ; Андреевич ; Викторовна ; Валерьевна ; Игоревна ; Николаевич ; Александровна ; Геннадьевна ; Александрович ; Леонидовна ; Иванович ; ";
        String fieldAddress = "ул.Крапоткина ; ул.Давида ; ул.Лебедя ; ул.Крапоткина ; ул.Сепаратистов ; ул.Давида ; ул.Опереты ; ул.Крапоткина ; ул.Лебедя ; ул.Красина ; ул.Миронова ; ул.Заграницы ; ул.Павленко ; ул.Космонавтов ; ул.Крапоткина ; ул.Красной Армии ; ул.Миронова ";
        String fieldTelephone = "345345 ; 6785454 ; 5455667 ; 893434 ; 233568 ; 9783242 ; 6797833 ; 345345 ; 780978235 ; 345343 ; 345345 ; 3453455 ; 98734534 ; 567878 ; 3343664 ; 6767866 ; 2342342 ";
        String fieldRating = "3 4 5 3 7 8 2 ; 4 2 3 9 5 4 5 ; 9 2 3 4 1 4 6 ; 2 3 5 2 9 3 5 ; 9 8 7 5 6 7 4 ; 4 5 7 8 4 5 6 ; 5 6 4 5 6 4 9 ; 5 6 5 6 8 5 6 ; 4 5 4 7 5 6 8 ; 5 4 5 4 4 5 6 ; 4 3 5 6 4 5 7 ; 5 4 5 6 4 5 6 ; 4 5 4 5 6 4 5 ; 4 5 4 5 6 4 5 ; 4 5 4 5 6 4 5 ; 7 8 9 6 7 8 6 ; 6 7 8 6 7 4 5 ";
        abiturient[0] = fieldId.split(" ; ");
        abiturient[1] = fieldLastName.split(" ; ");
        abiturient[2] = fieldFirstName.split(" ; ");
        abiturient[3] = fieldPatronymic.split(" ; ");
        abiturient[4] = fieldAddress.split(" ; ");
        abiturient[5] = fieldTelephone.split(" ; ");
        abiturient[6] = fieldRating.split(" ; ");
    }
}
