package dk.topdanmark.developerforum.beanvalidation.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DigitsOnlyValidator  implements ConstraintValidator<DigitsOnly, String> {

	//Matches any number from 1 and up
	private static String PATTERN = "[1-9][0-9]*";
	private static Pattern COMPILED_PATTERN = Pattern.compile(PATTERN);
	
	@Override
	public void initialize(DigitsOnly constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(value == null) {
			return false;
		}

		Matcher matcher = COMPILED_PATTERN.matcher(value);		
		return matcher.matches();
	}

}
