package com.lilei.configuration;

import com.lilei.beans.BraveKnight;
import com.lilei.beans.Knight;
import com.lilei.beans.Quest;
import com.lilei.beans.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
