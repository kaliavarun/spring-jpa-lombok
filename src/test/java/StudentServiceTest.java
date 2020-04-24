import com.model.Student1;
import com.model.Student2;
import com.service.StudentService;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = StudentApplication.class)
public class StudentServiceTest {

  @Autowired private StudentService studentService;

  @Test
  public void test_saveStudent1_ShouldSave() {
    Student1 student1 = Student1.builder().studentName("John").build();
    student1 = student1.toBuilder().mentor(student1).build();

    Student1 savedStudent1 = studentService.saveStudent1(student1);
    Condition<Student1> condition =
        new Condition<Student1>(
            String.valueOf(
                savedStudent1.getStudentId() == savedStudent1.getMentor().getStudentId()));
    assertThat(savedStudent1).isNotNull();
  }

  @Test
  public void test_saveStudent2_ShouldSave() {
    Student2 student2 = new Student2();
    student2.setStudentName("John");
    student2.setMentor(student2);

    Student2 savedStudent2 = studentService.saveStudent2(student2);
    assertThat(savedStudent2).isNotNull();
  }
}
