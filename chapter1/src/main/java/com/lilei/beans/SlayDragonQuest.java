package com.lilei.beans;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() throws QuestFailedException {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
