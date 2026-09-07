package ra.edu.api.validation.impl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ra.edu.api.repository.StudentRepository;
import ra.edu.api.validation.contraints.PhoneUnique;
@Component
@RequiredArgsConstructor
public class PhoneValidator implements ConstraintValidator<PhoneUnique, String> {
    private final StudentRepository studentRepository;
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // value chính là giá trị lấy dược của trường phone
        return !studentRepository.existsByPhone(value);
    }
}
