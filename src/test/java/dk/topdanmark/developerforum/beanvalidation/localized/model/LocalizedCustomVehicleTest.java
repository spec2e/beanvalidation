package dk.topdanmark.developerforum.beanvalidation.localized.model;

import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import dk.topdanmark.developerforum.beanvalidation.custom.model.Car;
import dk.topdanmark.developerforum.beanvalidation.custom.model.Wheel;
import dk.topdanmark.developerforum.beanvalidation.types.InsuranceType;

public class LocalizedCustomVehicleTest {

    private static Validator validator;

    @BeforeClass
    public static void setUp() {

	Locale danish = new Locale("da", "dk");
	Locale.setDefault(danish);
	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	LocalizedCustomVehicleTest.validator = factory.getValidator();
    }

    @Test
    public void testWheels() throws Exception {

	Car car = new Car();
	car.setInsured(InsuranceType.HUS);

	Wheel leftFrontWheel = new Wheel();
	leftFrontWheel.setPosition("LEFT_FRONT");
	leftFrontWheel.setDiameter(50);

	// vehicle.addWheel(leftFrontWheel);

	Set<ConstraintViolation<Car>> violations = LocalizedCustomVehicleTest.validator.validate(car);

	for (ConstraintViolation<Car> constraintViolation : violations) {
	    System.out.println(constraintViolation.getPropertyPath() + ", " + constraintViolation.getMessage());
	}

    }

}
