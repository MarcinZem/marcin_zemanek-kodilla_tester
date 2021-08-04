package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class stamp {
    private double wymiary;
    private String nazwa;
    private String czyOstemplowany;

    public stamp(double wymiary, String nazwa, String czyOstemplowany) {
        this.wymiary = wymiary;
        this.nazwa = nazwa;
        this.czyOstemplowany = czyOstemplowany;
    }

    public double getWymiary() {
        return wymiary;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getCzyOstemplowany() {
        return czyOstemplowany;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        stamp stamp = (stamp) o;
        return Double.compare(stamp.wymiary, wymiary) == 0
                && this.nazwa.equals(stamp.nazwa)
                && this.czyOstemplowany.equals(stamp.czyOstemplowany);
    }

    @Override public int hashCode() {
        return Objects.hash(wymiary, nazwa, czyOstemplowany);
    }

    @Override
    public String toString(){
        return "Stamp{" + "wymiary='" + wymiary + '\'' + ", nazwa='"
                + nazwa + '\'' + ", czyOstemplowany=" + czyOstemplowany + '}';
    }
}
