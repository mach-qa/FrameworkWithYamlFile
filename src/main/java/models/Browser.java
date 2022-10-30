package models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;


public class Browser {
    Map<String, Object> browserProperties = new LinkedHashMap<>();

    @JsonAnySetter
    void setBrowserProperties (String key, Object value) {
        browserProperties.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> getBrowserProperties() {
        return browserProperties;
    }
}
