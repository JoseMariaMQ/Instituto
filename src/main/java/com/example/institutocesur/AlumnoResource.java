package com.example.institutocesur;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoResource {

    @RequestMapping(value="/ps", method = RequestMethod.GET, produces = "application/xml")
    public Alumno getById() {
        return new Alumno(1, "José María", "2º DAM");
    }
}
