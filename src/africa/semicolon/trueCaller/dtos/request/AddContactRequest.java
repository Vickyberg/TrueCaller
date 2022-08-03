package africa.semicolon.trueCaller.dtos.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
public class AddContactRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private  String userEmail;


}
