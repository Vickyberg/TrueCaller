package africa.semicolon.trueCaller.dtos.responses;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
public class AddContactResponse {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;

    public String message;


}
