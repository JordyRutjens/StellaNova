package com.demo.springboot.Repositories;


import com.demo.springboot.Logic.Mars;
import com.demo.springboot.Logic.NearEarthObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NearEarthObjectData
{
    private final List<NearEarthObject> neoList = new ArrayList<>();


    public NearEarthObjectData()
    {
        Date date = new Date();
        NearEarthObject object1 = new NearEarthObject(1,date,"Earth", 299.22f, 20.25f);
        NearEarthObject object2 = new NearEarthObject(1,date,"Jupiter", 299.22f, 20.25f);
        NearEarthObject object3 = new NearEarthObject(1,date,"Mars", 299.22f, 20.25f);
        NearEarthObject object4 =new NearEarthObject(1,date,"Earth", 299.22f, 20.25f);

        neoList.add((object1));
        neoList.add((object2));
        neoList.add((object3));
        neoList.add((object4));
    }

    public List<NearEarthObject>GetAllNEOData()
    {
        return neoList;
    }
}

