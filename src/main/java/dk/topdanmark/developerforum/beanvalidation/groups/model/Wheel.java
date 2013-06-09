package dk.topdanmark.developerforum.beanvalidation.groups.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Wheel {

    @NotNull
    private String position;

    @NotNull
    @Min(value = 30)
    @Max(value = 200)
    private Integer diameter;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }


}
