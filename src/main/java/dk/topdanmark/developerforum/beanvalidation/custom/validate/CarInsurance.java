package dk.topdanmark.developerforum.beanvalidation.custom.validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CarInsuranceValidator.class)
public @interface CarInsurance {

    String message() default "{dk.topdanmark.developerforum.beanvalidation.types.CarInsurance}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
