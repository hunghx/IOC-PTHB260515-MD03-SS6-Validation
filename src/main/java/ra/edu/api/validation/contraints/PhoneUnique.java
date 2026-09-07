package ra.edu.api.validation.contraints;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import ra.edu.api.validation.impl.PhoneValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneValidator.class)
public @interface PhoneUnique {
    String message() default "Số điện thoại không trùng lặp";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
