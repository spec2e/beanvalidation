package dk.topdanmark.developerforum.beanvalidation.groups.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Motor {

    @NotNull
    private String fuel;

    @Min(value = 500)
    @Max(value = 5000)
    private Integer ccm;

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Integer getCcm() {
        return ccm;
    }

    public void setCcm(Integer ccm) {
        this.ccm = ccm;
    }


}
