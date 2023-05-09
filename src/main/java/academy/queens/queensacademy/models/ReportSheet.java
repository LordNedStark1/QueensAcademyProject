package academy.queens.queensacademy.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
@Builder

@AllArgsConstructor
@RequiredArgsConstructor
public class ReportSheet {

    private String reportSheetId;
    private List<String> examId = new ArrayList<>();
}
