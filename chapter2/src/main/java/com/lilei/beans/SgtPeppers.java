package com.lilei.beans;

import org.springframework.stereotype.Component;

import javax.inject.Named;

// 给 Bean 命名
@Component("lonelyHeartsClub")
//@Named("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
