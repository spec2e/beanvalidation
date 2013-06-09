package dk.topdanmark.developerforum.beanvalidation.model;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import dk.topdanmark.developerforum.beanvalidation.model.Vehicle;
import dk.topdanmark.developerforum.beanvalidation.model.Wheel;

public class VehicleTest {
	
	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		VehicleTest.validator = factory.getValidator();
	}
	
	@Test
	public void testWheels() throws Exception {
		
		Vehicle vehicle = new Car();
		
		Wheel leftFrontWheel = new Wheel();
		leftFrontWheel.setPosition("LEFT_FRONT");
		leftFrontWheel.setDiameter("50 cm");
		
		//vehicle.addWheel(leftFrontWheel);
		
		Set<ConstraintViolation<Vehicle>> violations = VehicleTest.validator.validate(vehicle);
		
		for (ConstraintViolation<Vehicle> constraintViolation : violations) {
			System.out.println(constraintViolation.getPropertyPath() + ", " + constraintViolation.getMessage());
		}
		
		
	}
	
}
