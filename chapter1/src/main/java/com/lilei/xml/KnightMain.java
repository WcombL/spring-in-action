package com.lilei.xml;

import com.lilei.beans.Knight;
import com.lilei.beans.QuestFailedException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) throws QuestFailedException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:knight.xml");

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

        context.close();
    }
}
