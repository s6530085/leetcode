package me.sunmin.algorithm;
//https://leetcode.com/problems/keys-and-rooms/
//Runtime: 11 ms, faster than 37.21% of Java online submissions for Keys and Rooms.
//todosm

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P841_KeysAndRooms {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> openRooms = new HashSet<Integer>();
		openRooms.add(0);
		
		Set<Integer> current = new HashSet<Integer>();
		current.add(0);
		while(current.size() > 0) {
			Set<Integer> next = new HashSet<Integer>();
			for (Integer i : current) {
				List<Integer> l = rooms.get(i);
				for (Integer roomID : l) {
					if (!openRooms.contains(roomID)) {
						next.add(roomID);
						openRooms.add(roomID);
					}
				}
			}
			current = next;
		}
		
		return openRooms.size() == rooms.size();

    }
}
