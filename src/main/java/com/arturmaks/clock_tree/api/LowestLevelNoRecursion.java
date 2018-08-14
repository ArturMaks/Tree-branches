package com.arturmaks.clock_tree.api;

import com.arturmaks.clock_tree.domain.Saka;

import java.util.ArrayList;
import java.util.List;

public class LowestLevelNoRecursion implements LowestLevel {

    @Override
    public int maxDepth(Saka saka) {
        if (saka == null) {
            return 0;
        }

        List<Saka> mainSakos = new ArrayList<Saka>();
        List<Saka> tempSakos = new ArrayList<Saka>();
        int depth = 1;
        if (saka.hasChildren()) {
            mainSakos.addAll(saka.getSakos());
            while (!mainSakos.isEmpty()) {

                for (Saka innerSaka : mainSakos) {
                    if (innerSaka.hasChildren()) {
                        tempSakos.addAll(innerSaka.getSakos());
                    }
                }
                mainSakos.clear();
                mainSakos.addAll(tempSakos);
                tempSakos.clear();
                depth++;
            }
        }
        return depth;
    }
}
