package dk.topdanmark.developerforum.beanvalidation.custom.validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DigitsOnlyValidator.class)
public @interface DigitsOnly {

    String message() default "{dk.topdanmark.developerforum.beanvalidation.validate.DigitsOnly}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}