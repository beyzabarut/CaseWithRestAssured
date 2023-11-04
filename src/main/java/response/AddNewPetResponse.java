package response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;


@JsonIgnoreProperties(ignoreUnknown=true)
public class AddNewPetResponse {
    @JsonProperty
    public int id;

    @JsonProperty
    public String name;

    @JsonProperty
    public String status;

    @JsonProperty
    public ArrayList<String> photoUrls;


    @JsonIgnoreProperties(ignoreUnknown=true)
    public static class Category {
        @JsonProperty
        public int id;

        @JsonProperty
        public String name;
    };


    @JsonIgnoreProperties(ignoreUnknown=true)
    public static class Tags{
        @JsonProperty
        public int id;

        @JsonProperty
        public String name;
    };
}
