package africa.semicolon.trueCaller.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
public class Contact {
    @Id
    private String id; //identifier

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;



}
