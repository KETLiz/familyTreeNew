package model;

import java.util.Iterator;
import java.util.List;

public class HumanIterator implements Iterator<Human> {
    private List<Human> familyList;
    private int index;

    public HumanIterator(List<Human> familyList) {
        this.familyList = familyList;
    }

    @Override
    public boolean hasNext() {
        return index < familyList.size();
    }

    @Override
    public Human next() {
        return familyList.get(index++);
    }
    
}
