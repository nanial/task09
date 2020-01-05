package by.training.task09.state.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Region implements Serializable {

    private String centerOfReg;
    private Locality[] localities;

    public Region() {
    }

    public Region(String centerOfReg, Locality[] localities) {
        this.centerOfReg = centerOfReg;
        this.localities = localities;
    }

    public void setCenterOfReg(String centerOfReg) {
        this.centerOfReg = centerOfReg;
    }

    public Locality[] getLocalities() {
        return localities;
    }

    public void setLocalities(Locality[] localities) {
        this.localities = localities;
    }

    public String getCenterOfReg() {
        return centerOfReg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;

        Region region = (Region) o;

        if (getCenterOfReg() != null ? !getCenterOfReg().equals(region.getCenterOfReg()) : region.getCenterOfReg() != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getLocalities(), region.getLocalities());
    }

    @Override
    public int hashCode() {
        int result = getCenterOfReg() != null ? getCenterOfReg().hashCode() : 0;
        result = 31 * result + Arrays.hashCode(getLocalities());
        return result;
    }

    @Override
    public String toString() {
        return "Region{" +
                "centerOfReg='" + centerOfReg + '\'' +
                ", localities=" + Arrays.toString(localities) +
                '}';
    }
}
