package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//https://leetcode.com/problems/flatten-nested-list-iterator/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Flatten Nested List Iterator.

public class P341_FlattenNestedListIterator implements Iterator<Integer> {
	public P341_FlattenNestedListIterator(List<NestedInteger> nestedList) {
        for (int i = 0; i < nestedList.size(); i++) {
        	p(nestedList.get(i));
        }
    }

	private void p(NestedInteger ni) {
		if (ni.isInteger()) {
			list.add(ni.getInteger());
		}
		else {
			List<NestedInteger> li = ni.getList();
			for (NestedInteger nni : li) {
				p(nni);
			}
		}
	}
	
	private List<Integer> list = new ArrayList<Integer>();
	private int index = 0;
    @Override
    public Integer next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}
