package ra.edu.api.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.edu.api.dto.request.StudentCreateDto;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    // Thêm mới
    @PostMapping
    public ResponseEntity<?> createStudent(@Valid @RequestBody StudentCreateDto request) {
        // Logic to create a new student
        return ResponseEntity.ok("Student created successfully");
    }
}
