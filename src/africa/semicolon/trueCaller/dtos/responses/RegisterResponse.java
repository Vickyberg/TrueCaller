package africa.semicolon.trueCaller.dtos.responses;

import lombok.Data;

@Data
public class RegisterResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
