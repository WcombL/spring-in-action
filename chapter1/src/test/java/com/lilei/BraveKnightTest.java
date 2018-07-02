package com.lilei;

import com.lilei.beans.BraveKnight;
import com.lilei.beans.Quest;
import com.lilei.beans.QuestFailedException;
import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() throws QuestFailedException {
        Quest mockQuest = Mockito.mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }
}
