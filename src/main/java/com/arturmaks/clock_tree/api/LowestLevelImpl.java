package com.arturmaks.clock_tree.api;

import com.arturmaks.clock_tree.domain.Saka;

public class LowestLevelImpl implements LowestLevel {

    private int maxDepth = 0;

    private void maxDepthRecursion(Saka saka, int depth) {

        if (saka.hasChildren()) {
            for (Saka childSaka : saka.getSakos()) {

                maxDepthRecursion(childSaka, depth + 1);
                if (maxDepth < depth + 1) {
                    maxDepth = depth + 1;
                }
            }
        }
    }

    @Override
    public int maxDepth(Saka saka) {
        maxDepthRecursion(saka, 1);
        return maxDepth;
    }
}