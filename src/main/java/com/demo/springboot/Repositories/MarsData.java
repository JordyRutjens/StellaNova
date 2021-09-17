package com.demo.springboot.Repositories;


import com.demo.springboot.Logic.Mars;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarsData
{
    private final List<Mars> marsList = new ArrayList<>();


    public MarsData()
    {
        Date date = new Date();
        Mars day1 = new Mars(1,1,date,1);
        Mars day2 = new Mars(1,1,date,2);
        Mars day3 = new Mars(1,1,date,3);
        Mars day4 = new Mars(1,1,date,4);

        marsList.add((day1));
        marsList.add((day2));
        marsList.add((day3));
        marsList.add((day4));
    }

    public List<Mars>GetAllMarsInfo()
    {
        return marsList;
    }
}

