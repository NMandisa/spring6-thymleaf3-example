package za.co.squnga.response;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private String timestamp;
    private String message;
    private String details;
}
