package dk.topdanmark.developerforum.beanvalidation.custom.model;

import javax.validation.constraints.NotNull;

import dk.topdanmark.developerforum.beanvalidation.custom.validate.CarInsurance;
import dk.topdanmark.developerforum.beanvalidation.custom.validate.DigitsOnly;
import dk.topdanmark.developerforum.beanvalidation.types.InsuranceType;

public class Car extends Vehicle {

    @NotNull
    @DigitsOnly
    private String length;

    @NotNull
    @CarInsurance
    private InsuranceType insured;

    private Motor motor;

    public Motor getMotor() {
	return motor;
    }

    public void setMotor(Motor motor) {
	this.motor = motor;
    }

    public String getLength() {
	return length;
    }

    public void setLength(String length) {
	this.length = length;
    }

    public InsuranceType getInsured() {
	return insured;
    }

    public void setInsured(InsuranceType insured) {
	this.insured = insured;
    }

}
