package dk.topdanmark.developerforum.beanvalidation.custom.validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;

@NotNull
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CarInsuranceValidator.class)
public @interface CarInsurance {

    String message() default "{dk.topdanmark.developerforum.beanvalidation.types.CarInsurance.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
