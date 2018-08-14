package com.arturmaks.clock_tree.api;

import com.arturmaks.clock_tree.domain.Saka;
import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
    private LowestLevel lowestLevel;

    @Test
    public void givenNewSakaTree_WhenTreeIs5LevelsDeep_ThenReturns5_RECURSION() {
        lowestLevel = new LowestLevelImpl();
        int result = lowestLevel.maxDepth(getSakaForTest());
        Assert.assertEquals("Should be 5", 5, result);
    }

    @Test
    public void givenNewSakaTree_WhenTreeIs5LevelsDeep_ThenReturns5_NO_RECURSION() {
        //given
        lowestLevel = new LowestLevelNoRecursion();
        //when
        int result2 = lowestLevel.maxDepth(getSakaForTest());
        //then
        Assert.assertEquals("Should be 5", 5, result2);
    }


    private Saka getSakaForTest() {
        Saka saka1 = new Saka();
        Saka saka11 = new Saka();
        Saka saka12 = new Saka();
        saka1.getSakos().add(saka11);
        saka1.getSakos().add(saka12);
        saka11.getSakos().add(new Saka());
        Saka saka121 = new Saka();
        Saka saka122 = new Saka();
        saka12.getSakos().add(saka121);
        saka12.getSakos().add(saka122);
        saka12.getSakos().add(new Saka());

        saka121.getSakos().add(new Saka());

        Saka saka1221 = new Saka();
        saka121.getSakos().add(saka1221);
        saka121.getSakos().add(new Saka());
        saka1221.getSakos().add(new Saka());
        return saka1;
    }

}
