package com.srting.algorithm;

import java.time.Clock;
import java.time.Instant;

public class MakeClock {

    public void watchTime()  {
        Clock clock = Clock.systemUTC();

        System.out.println("UTC time = " +clock.instant() );


    }
}
