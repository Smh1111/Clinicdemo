package com.example.CustomApi.Clinic.controlller;

import com.example.CustomApi.Clinic.model.AppointmentModel;
import com.example.CustomApi.Clinic.repository.AppointmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("appointment")
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping
    public List<AppointmentModel> getAll()
    {
        return appointmentRepository.findAll();
    }

    @GetMapping(value ="{id}")
    public AppointmentModel getById(@PathVariable String name)
    {
        return appointmentRepository.getOne(Long.valueOf(name));
    }


    @PostMapping()
    public AppointmentModel save(@RequestBody AppointmentModel appointmentModel)
    {
        return appointmentRepository.saveAndFlush(appointmentModel);

    }

    @PutMapping()
    public AppointmentModel update(@RequestBody AppointmentModel appointmentModel)
    {
        AppointmentModel existingappointment = appointmentRepository.getOne(appointmentModel.getId());
        BeanUtils.copyProperties(appointmentModel, existingappointment, "id");
        return appointmentRepository.saveAndFlush(existingappointment);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id)
    {
        appointmentRepository.deleteById(Long.valueOf(id));
    }
}
