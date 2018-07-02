package com.lilei.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 依赖CompactDisc Bean
 */
@Component
public class CDPlayer implements MediaPlayer{

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cdx){
        this.cd = cdx;
    }

    @Override
    public void play() {
        cd.play();
    }
}
