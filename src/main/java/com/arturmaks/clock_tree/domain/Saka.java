package com.arturmaks.clock_tree.domain;

import java.util.ArrayList;
import java.util.List;

public class Saka {

    private List<Saka> sakos;

    public Saka() {
        this.sakos = new ArrayList<>();
    }

    public boolean hasChildren() {
        return sakos != null && !sakos.isEmpty();
    }

    public List<Saka> getSakos() {
        return sakos;
    }

    public void setSakos(List<Saka> sakos) {
        this.sakos = sakos;
    }

}
