package me.sunmin.algorithm;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/unique-email-addresses/
//Runtime: 54 ms, faster than 56.89% of Java online submissions for Unique Email Addresses.

public class P929_UniqueEmailAddresses {
	public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>();
		for (String email : emails) {
			String[]ss = email.split("@");
			if (ss.length == 2) {
				String local = ss[0];
				String domain = ss[1];
				local = local.replace(".", "");
				local = local.substring(0, local.indexOf("+"));
				set.add(local+domain);
			}
		}
		
		return set.size();

    }
}
