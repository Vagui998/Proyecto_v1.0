package com.javeriana.proyecto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javeriana.proyecto.Entities.ToolCity;
import com.javeriana.proyecto.Services.ToolCityService;

@RestController
@RequestMapping("/toolCity")
public class ToolCityController
{
    @Autowired
    private ToolCityService service;

    @GetMapping(value = "/getAll", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ToolCity> getAll()
    {
        return service.getAll();  
    }
}
