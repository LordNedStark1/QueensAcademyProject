package academy.queens.queensacademy.models;

import jakarta.persistence.Id;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ReportSheet {
    @Id
    private String reportSheetId;
    private List<String> examId = new ArrayList<String>();
}
