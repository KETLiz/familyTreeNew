package model;

import java.util.Iterator;
import java.util.*;

public class HumanIterator implements Iterator<Human> {
    List<Human> familyList;
    int index;

    public HumanIterator(List<Human> familyList) {
        this.familyList = familyList;
    }
    @Override
    public boolean hasNext() {
        index < familyList.size();
    }

    @Override
    public Human next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }
    
}
