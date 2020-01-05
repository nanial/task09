package by.training.task09.state.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Locality implements Serializable {

    private String nameOfLocality;
    private Town[] towns;

    public Locality() {
    }

    public Locality(String nameOfLocality, Town[] towns) {
        this.nameOfLocality = nameOfLocality;
        this.towns = towns;
    }

    public String getNameOfLocality() {
        return nameOfLocality;
    }

    public void setNameOfLocality(String nameOfLocality) {
        this.nameOfLocality = nameOfLocality;
    }

    public Town[] getTowns() {
        return towns;
    }

    public void setTowns(Town[] towns) {
        this.towns = towns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Locality)) return false;

        Locality locality = (Locality) o;

        if (getNameOfLocality() != null ? !getNameOfLocality().equals(locality.getNameOfLocality()) : locality.getNameOfLocality() != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getTowns(), locality.getTowns());
    }

    @Override
    public int hashCode() {
        int result = getNameOfLocality() != null ? getNameOfLocality().hashCode() : 0;
        result = 31 * result + Arrays.hashCode(getTowns());
        return result;
    }

    @Override
    public String toString() {
        return "Locality{" +
                "nameOfLocality='" + nameOfLocality + '\'' +
                ", towns=" + Arrays.toString(towns) +
                '}';
    }
}
