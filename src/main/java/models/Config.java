package models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
@Data
@NoArgsConstructor
public class Config {

    private String activeEnvironment;
    private Browser browser;

    private HashMap<String, Environment> environments = new HashMap<>();
    @JsonAnyGetter
    void setEnvironments(String key, Environment value) {
        environments.put(key, value);
    }
    @JsonAnySetter
    public HashMap<String, Environment> getEnvironments() {
        return environments;
    }
}
