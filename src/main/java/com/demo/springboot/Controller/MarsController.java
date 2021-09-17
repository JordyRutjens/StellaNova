package com.demo.springboot.Controller;

import com.demo.springboot.Logic.Mars;
import com.demo.springboot.Repositories.MarsData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mars")
public class MarsController
{
    private static final MarsData marsData = new MarsData();
    public List<Mars> marsList = marsData.GetAllMarsInfo();

    @GetMapping
    public ResponseEntity<List<Mars>>getAllMarsData()
    {

        if (marsList != null)
        {
            return ResponseEntity.ok(marsList);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Mars>getMarsDataByID(@PathVariable int id)
    {
        for (Mars mars: marsList) {
            if (mars.getdayID() == id)
            {
                return ResponseEntity.ok(mars);
            }
        }

        return ResponseEntity.notFound().build();
    }
}
