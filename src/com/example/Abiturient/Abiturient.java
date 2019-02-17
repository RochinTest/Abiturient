package com.example.Abiturient;


import java.text.DecimalFormat;
import java.util.Objects;

public class Abiturient {
    private static final DecimalFormat count = new DecimalFormat("# 0.00");

    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private String telephone;
    private String ratings;
    private String excellentRating;


    public Abiturient(String lastName, String firstName, String patronymic, String address, String telephone, String ratings, String excellentRating) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.telephone = telephone;
        this.ratings = ratings;
        this.excellentRating = excellentRating;
        counterExelens();
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getRatings() {
        return ratings;
    }

    public String getExcellentRating() {
        return excellentRating;
    }

    public void setExcellentRating(String excellentRating) {
        this.excellentRating = excellentRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abiturient)) return false;
        Abiturient abiturient = (Abiturient) o;
        return Objects.equals(getLastName(), abiturient.getLastName()) &&
                Objects.equals(getFirstName(), abiturient.getFirstName()) &&
                Objects.equals(getPatronymic(), abiturient.getPatronymic()) &&
                Objects.equals(getAddress(), abiturient.getAddress()) &&
                Objects.equals(getTelephone(), abiturient.getTelephone()) &&
                Objects.equals(getRatings(), abiturient.getRatings()) &&
                Objects.equals(getExcellentRating(), abiturient.getExcellentRating());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastName(), getFirstName(), getPatronymic(), getAddress(), getTelephone(), getRatings(), getExcellentRating());
    }


    @Override
    public String toString() {
        return "Студент " + lastName + " " + firstName + " " + excellentRating;
    }

    private void counterExelens() {

        double counter = 0;
        String[] str = null;
        counter = 0;
        str = getRatings().split(" +");
        for (int i = 0; i < str.length; i++) {
            counter = (counter + (Integer.parseInt(str[i])));
        }
        String exellens = count.format(counter / str.length);
        setExcellentRating(exellens);


    }
}

