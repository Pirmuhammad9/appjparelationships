package uz.pdp.appjparelationships.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.security.auth.Subject;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto {
    private Integer groupId;
    private String firstName;
    private String lastName;
    private String city;
    private String district;
    private String street;
    private List<Integer> subjects;
}
