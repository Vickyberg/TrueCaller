package africa.semicolon.trueCaller.data.models;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("Users")
@Data
@NoArgsConstructor
public class User {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String username;
    @DBRef
private List<Contact> contacts = new ArrayList<>();


}
