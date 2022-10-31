package org.example;
import lombok.SneakyThrows;
import reader.YamlReader;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;


public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        YamlReader yaml = new YamlReader();

        String activeEnvironment = yaml.getConfig().getActiveEnvironment();
        String selectedEnvironment = Arrays.toString(yaml.getConfig().getEnvironment().getEnvironments().toArray());

        System.out.println(activeEnvironment);
        System.out.println(selectedEnvironment);

    }
}