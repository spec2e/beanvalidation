package dk.topdanmark.developerforum.beanvalidation.custom.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import dk.topdanmark.developerforum.beanvalidation.types.InsuranceType;

public class CarInsuranceValidator implements ConstraintValidator<CarInsurance, InsuranceType> {

    @Override
    public void initialize(CarInsurance constraintAnnotation) {
    }

    @Override
    public boolean isValid(InsuranceType value, ConstraintValidatorContext context) {

	if (value == InsuranceType.BIL_ANSVAR || value == InsuranceType.BIL_KASKO) {
	    return true;
	}

	return false;
    }

}
