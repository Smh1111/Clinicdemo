package com.example.CustomApi.Clinic.controlller;

import com.example.CustomApi.Clinic.model.DoctorModel;
import com.example.CustomApi.Clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping
    public List<DoctorModel> getAll()
    {
        return doctorRepository.findAll();
    }

    @GetMapping(value ="{id}")
    public DoctorModel getById(@PathVariable String id)
    {
        return doctorRepository.getOne(Long.valueOf(id));
    }


    @PostMapping()
    public DoctorModel save(@RequestBody DoctorModel doctorModel)
    {
        return doctorRepository.saveAndFlush(doctorModel);

    }



    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id)
    {
        doctorRepository.deleteById(Long.valueOf(id));
    }
}
