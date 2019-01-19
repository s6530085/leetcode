package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/subdomain-visit-count/
//Runtime: 94 ms, faster than 8.16% of Java online submissions for Subdomain Visit Count.
//todosm

public class P811_SubdomainVisitCount {
	public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (String s : cpdomains) {
            String[] ss = s.split(" ");
            Integer count = Integer.parseInt(ss[0]);
            String domain = ss[1];
            String[] subs = domain.split("[.]");
            String root = subs[subs.length-1];
            Integer rootCount = m.get(root);
            if (rootCount == null) {
                m.put(root, count);
            }
            else {
                m.put(root, count+rootCount);
            }
            Integer domainCount= m.get(domain);
            if (domainCount == null) {
                m.put(domain, count);
            }
            else {
                m.put(domain, count+domainCount);
            }
            if (subs.length == 3) {
                String subDomain = subs[1] + "." + root;
                Integer subDomainCount= m.get(subDomain);
                if (subDomainCount == null) {
                    m.put(subDomain, count);
                }
                else {
                    m.put(subDomain, count+subDomainCount);
                }
            }
        }
        List<String> result = new ArrayList<String>();
        for (String k : m.keySet()) {
            result.add(String.format("%d %s", m.get(k), k));
        }
        return result;
    }
}
