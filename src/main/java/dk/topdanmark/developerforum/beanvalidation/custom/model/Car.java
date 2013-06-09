package dk.topdanmark.developerforum.beanvalidation.custom.model;

import dk.topdanmark.developerforum.beanvalidation.custom.validate.CarInsurance;
import dk.topdanmark.developerforum.beanvalidation.types.InsuranceType;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.util.Date;

public class Car extends Vehicle {

    @Min(value = 100, message = "{car.length.message}")
    @Max(value = 600, message = "{car.length.message}")
    private int length;

    @CarInsurance
    private InsuranceType insured;

    @Past(message="{car.registered.past}")
    private Date registered;

    @Valid
    private Motor motor;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public InsuranceType getInsured() {
        return insured;
    }

    public void setInsured(InsuranceType insured) {
        this.insured = insured;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }
}
