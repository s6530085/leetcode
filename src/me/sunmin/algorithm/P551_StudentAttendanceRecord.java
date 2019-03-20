package me.sunmin.algorithm;
//https://leetcode.com/problems/student-attendance-record-i/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Student Attendance Record I.

public class P551_StudentAttendanceRecord {
	
	public boolean checkRecord(String s) {
		boolean hasA = false;
		int cl = 0;
		int l = s.length();
		for (int i = 0; i < l; i++) {
			char c = s.charAt(i);
			if (c == 'A') {
				if (hasA) {
					return false;
				}
				else {
					hasA = true;
				}
				cl = 0;
			}
			else if (c == 'L') {
				if (cl >= 2) {
					return false;
				}
				else {
					cl++;
				}
			}
			else {
				cl = 0;
			}
		}
		return true;
    }
	
}
