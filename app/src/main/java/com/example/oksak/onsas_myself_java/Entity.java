package com.example.oksak.onsas_myself_java;

import java.util.List;

public class Entity {

    public String base;
    public List<Weather> weather;

    public class Weather {
        public int id;
        public String main;
        public String description;
        public String icon;
    }

}