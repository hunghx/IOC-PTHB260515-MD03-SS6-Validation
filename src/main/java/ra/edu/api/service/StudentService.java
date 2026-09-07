package ra.edu.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.edu.api.dto.request.StudentCreateDto;
import ra.edu.api.entity.Student;
import ra.edu.api.exception.PhoneUniqueException;
import ra.edu.api.repository.StudentRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public Student addStudent(StudentCreateDto request)  {
        if (studentRepository.existsByPhone(request.getPhone())) {
            throw new PhoneUniqueException("Phone number already exists: " + request.getPhone());
        }
        // Biến đổi thanh entity
        // dùng getter và setter
        Student student = new Student();
        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setPhone(request.getPhone());
        student.setCreatedAt(LocalDateTime.now());
        student.setDob(request.getDob());
        student.setAddress(request.getAddress());
        student.setGpa(request.getGpa());
        return studentRepository.save(student);
    }
}
