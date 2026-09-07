package ra.edu.api.dto.request;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import ra.edu.api.validation.contraints.PhoneUnique;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
public class StudentCreateDto {
    // Thư viện Validation cung cấp các annotation @
    @NotBlank(message = "Tên không được để trống")
    @Size(min = 6, max = 50)
//    @Pattern(regexp = "^[a-zA-Z0-9]+$") // chỉ chưa các chữ cái alpha numeric
    private String name;
    @NotBlank
    @Email // @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
    private String email;
    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$")
    // annotaion kiểm tra số điện thoại ko trùng lặp
//    @PhoneUnique(message = "Phone must be unique")
    private String phone;
    @NotBlank
    private String address;
    @NotNull
    @DecimalMin(value = "0.0")
    @DecimalMax(value = "4.0")
    private BigDecimal gpa;
    @NotNull
    @Past // ngày trong quá khứ
    private LocalDate dob;
}
