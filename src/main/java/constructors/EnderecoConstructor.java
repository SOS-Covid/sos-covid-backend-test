package constructors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class EnderecoConstructor {
    private String street;
    private int number;
    private String complement;
    private String district;
    private String city;
    private String state;
    private String country;
    private String postal_code;
}
