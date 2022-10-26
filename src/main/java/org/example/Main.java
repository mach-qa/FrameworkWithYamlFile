package org.example;
import models.Browser;
import models.Config;
import reader.YamlReader;


public class Main {
    public static void main(String[] args) {

        YamlReader yaml = new YamlReader();

        String activeEnvironment = yaml.getConfig().getActiveEnvironment();

        System.out.println(yaml.getConfig().getEnvironments().get(activeEnvironment).getAppUrl());
    }
}