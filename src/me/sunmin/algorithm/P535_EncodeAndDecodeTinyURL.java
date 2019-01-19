package me.sunmin.algorithm;
//https://leetcode.com/problems/encode-and-decode-tinyurl/
//Runtime: 30 ms, faster than 4.28% of Java online submissions for Encode and Decode TinyURL.

//todosm
import java.util.HashMap;
import java.util.Map;

public class P535_EncodeAndDecodeTinyURL {
	private static final String host = "http://fuckyou.com/";
	private static final Map<String, String>map = new HashMap<String, String>();
	
	public String encode(String longurl) {
		String s = map.get(longurl);
		if (s != null) {
			return s;
		}
		else {
			s = String.format("%s%d", host, map.size());
			map.put(longurl, s);
			map.put(s, longurl);
			return s;
		}
	}
	
	public String decode(String shorturl) {
		return map.get(shorturl);
	}
}
