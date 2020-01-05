package by.training.task09.state.bean;

import java.io.Serializable;

public class Town implements Serializable {
    private String nameOfPlace;

    public Town(String nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public void setNameOfPlace(String nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Town)) return false;

        Town town = (Town) o;

        return getNameOfPlace() != null ? getNameOfPlace().equals(town.getNameOfPlace()) : town.getNameOfPlace() == null;
    }

    @Override
    public int hashCode() {
        return getNameOfPlace() != null ? getNameOfPlace().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Town{" +
                "nameOfPlace='" + nameOfPlace + '\'' +
                '}';
    }
}
