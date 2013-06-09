package dk.topdanmark.developerforum.beanvalidation.custom.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Motor {

    private String fuel;

    @Min(value = 500)
    @Max(value = 5000)
    private int ccm;

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

}
