package com.lilei.beans;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() throws QuestFailedException {
        quest.embark();
    }

}
