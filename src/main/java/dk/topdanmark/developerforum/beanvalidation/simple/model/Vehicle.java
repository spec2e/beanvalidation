package dk.topdanmark.developerforum.beanvalidation.simple.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Vehicle {

    @Valid
    @NotNull
    private List<Wheel> wheels;

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void addWheel(Wheel wheel) {

        if (wheels == null) {
            wheels = new ArrayList<Wheel>();
        }
        wheels.add(wheel);
    }
}
