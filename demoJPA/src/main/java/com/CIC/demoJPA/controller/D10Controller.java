package com.CIC.demoJPA.controller;

import com.CIC.demoJPA.service.D10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//dùng để xác định lớp là controller, dùng @RestController để cấu hình dễ dàng hơn.
public class D10Controller {
    @Autowired
    private D10Service d10Service;

    public D10Controller(D10Service d10Service) {
        this.d10Service = d10Service;
    }

    @GetMapping(value = "/readFile")
    public ResponseEntity<?> readFile(){
        String res = d10Service.createD10();
        return ResponseEntity.ok(res);
    }
}
