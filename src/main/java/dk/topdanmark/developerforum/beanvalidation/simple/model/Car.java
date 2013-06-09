package dk.topdanmark.developerforum.beanvalidation.simple.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import dk.topdanmark.developerforum.beanvalidation.types.InsuranceType;

public class Car extends Vehicle {

    @NotNull
    private String length;

    @NotNull
    private InsuranceType insured;
    
    @Valid
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
