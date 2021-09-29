package com.rezwan2525.event_calender_mvvm_room.services.repositories;

import static org.junit.Assert.*;

import android.app.Application;
import android.content.Context;

import com.rezwan2525.event_calender_mvvm_room.services.models.Event;

import org.junit.Test;
import org.mockito.Mock;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class EventRepoTest {

    @Mock
    Application application;

    private LocalDate localDate;

    public EventRepoTest(){
        localDate = LocalDate.of(2021, 9, 29);
    }


}