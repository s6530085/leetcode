package me.sunmin.algorithm;
//https://leetcode.com/problems/maximize-distance-to-closest-person/
//Runtime: 3 ms, faster than 94.22% of Java online submissions for Maximize Distance to Closest Person.


public class P849_MaximizeDistanceClosestPerson {
	public int maxDistToClosest(int[] seats) {
		int[] distances = new int[seats.length];
		int distance = 0;
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 1) {
				distance = 0;
				int l = i-1;
				while (l >= 0) {
					if (seats[l] == 1) {
						break;
					}
					else {
						distance++;
						if (distances[l] == 0) {
							distances[l] = distance;
						}
						else {
							distances[l] = Math.min(distance, distances[l]);
						}
					}
					l--;
				}
					
				distance = 0;
				int r = i+1;
				while (r < seats.length) {
					if (seats[r] == 1) {
						break;
					}
					else {
						distance++;
						if (distances[r] == 0) {
							distances[r] = distance;
						}
						else {
							distances[r] = Math.min(distance, distances[r]);
						}
					}
					r++;
				}
			}
		}
		int max = 0;
		for (int i = 0; i < distances.length; i++) {
			max = Math.max(distances[i], max);
		}
		return max;
    }
	
	public static void main(String[] args) {
		P849_MaximizeDistanceClosestPerson d = new P849_MaximizeDistanceClosestPerson();
		int i = d.maxDistToClosest(new int[] {0,0,1});
	}
}
