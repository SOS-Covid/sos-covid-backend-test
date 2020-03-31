package constructors;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampanhaConstructor {

    private String campaign_name;
    private String reference_user;
    private String description;
    private String assisted_entity;
    private List<String> type_donations;
    private String state;
    private String city;
    private List<String> served_region;
    private String initial_date;
    private String final_date;
    private List<String> donate_channels;
    private String status;
}

