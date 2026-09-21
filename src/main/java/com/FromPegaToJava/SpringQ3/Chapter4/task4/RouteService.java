package com.FromPegaToJava.SpringQ3.Chapter4.task4;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class RouteService {
    private final RoutesProperties routesProperties;

    public RouteService(RoutesProperties props){
        this.routesProperties = props;
    }

    public String resolve(String path) {
        for (RoutesProperties.Rule rule : routesProperties.getRules()){
            if(path.startsWith(rule.prefix())){
                return String.valueOf(routesProperties.getOverrides().getOrDefault(rule.service(), URI.create(rule.service())));
            }
        }
        return routesProperties.defaultService;
    }
}