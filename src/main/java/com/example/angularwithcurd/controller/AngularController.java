package com.example.angularwithcurd.controller;

import com.example.angularwithcurd.entity.AngularEntity;
import com.example.angularwithcurd.service.AngularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/angular")
public class AngularController {

    @Autowired
    private AngularService angularService;

    @GetMapping
    public List<AngularEntity> getEmpList(){
        return angularService.getAllList();
    }

    @PostMapping
    public AngularEntity enterEmp(@RequestBody AngularEntity emp){
        return angularService.insertEmp(emp);
    }

    @GetMapping("{id}")
    public AngularEntity empById(@PathVariable("id") Long id){
        return angularService.empById(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<AngularEntity> updateEmp(@PathVariable("id") Long id,@RequestBody AngularEntity angularEntity){
        angularService.empById(id);
        angularEntity.setId(id);
        angularEntity.setName(angularEntity.getName());
        angularEntity.setEmailId(angularEntity.getEmailId());
        angularEntity.setMobile(angularEntity.getMobile());
        AngularEntity a = angularService.insertEmp(angularEntity);
        return ResponseEntity.ok(a);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmp(@PathVariable("id") Long id){
        AngularEntity emp = angularService.empById(id);
        angularService.deleteEmp(emp);
        Map<String,Boolean> response = new HashMap<>();
        response.put("delete",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
