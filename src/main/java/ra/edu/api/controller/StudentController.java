package ra.edu.api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.edu.api.dto.request.StudentCreateDto;
import ra.edu.api.entity.Student;
import ra.edu.api.exception.PhoneUniqueException;
import ra.edu.api.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
private final StudentService studentService;
    // Thêm mới
    @PostMapping
    public ResponseEntity<?> createStudent(@Valid @RequestBody StudentCreateDto request) throws PhoneUniqueException {
        Student student = studentService.addStudent(request);
        return ResponseEntity.ok("Student created successfully");
    }
}
