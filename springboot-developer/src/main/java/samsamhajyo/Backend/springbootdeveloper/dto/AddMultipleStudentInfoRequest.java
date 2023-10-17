package samsamhajyo.Backend.springbootdeveloper.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samsamhajyo.Backend.springbootdeveloper.domain.StudentInfo;
import samsamhajyo.Backend.springbootdeveloper.domain.ConditionResult;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddMultipleStudentInfoRequest {
    private List<AddStudentInfoRequest> studentInfoList;
}
