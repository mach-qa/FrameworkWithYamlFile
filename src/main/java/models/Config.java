package models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


@Data
@NoArgsConstructor
public class Config {

//    protected String activeEnvironment;
//    protected Browser browser;
//
//    private Map<String, Environments> environment = new LinkedHashMap<>();
//
//    @JsonAnyGetter
//    void setEnvironment(String key, Environments value) {
//        environment.put(key, value);
//    }
//
//    @JsonAnySetter
//    public Map<String, Environments> getEnvironment() {
//        return environment;
//    }

    public String activeEnvironment;
    public Environments environment;
    public Browser browser;


}
