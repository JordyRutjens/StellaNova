package com.demo.springboot.Controller;

import com.demo.springboot.Logic.NearEarthObject;
import com.demo.springboot.Repositories.NearEarthObjectData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/neo")
public class NearEarthObjectController {

        private static final NearEarthObjectData neoData = new NearEarthObjectData();
        public List<NearEarthObject> neoList = neoData.GetAllNEOData();

        @GetMapping
        public ResponseEntity<List<NearEarthObject>> getAllNEOData()
        {

            if (neoList != null)
            {
                return ResponseEntity.ok(neoList);
            }
            return ResponseEntity.notFound().build();
        }

        @GetMapping("{orbiting}")
        public ResponseEntity<NearEarthObject>getObjectDataByOrbit(@PathVariable String orbiting)
        {
            for (NearEarthObject neo: neoList) {
                if (neo.getOrbitingBody().equals(orbiting))
                {
                    return ResponseEntity.ok(neo);
                }
            }
            return ResponseEntity.notFound().build();
        }
    }
