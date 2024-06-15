package Coding.MoreCompilicated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Hackerrank_subdomainVisits {

    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> visitCounts = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] parts = cpdomain.split(" ");
            int count = Integer.parseInt(parts[0]);
            String domain = parts[1];

            // Split domain into its component parts
            String[] subdomains = domain.split("\\.");

            // Process each subdomain
            StringBuilder currentDomain = new StringBuilder();
            for (int i = subdomains.length - 1; i >= 0; i--) {
                if (i < subdomains.length - 1) {
                    currentDomain.insert(0, subdomains[i] + ".");
                } else {
                    currentDomain.insert(0, subdomains[i]);
                }

                String subdomain = currentDomain.toString();
                visitCounts.put(subdomain, visitCounts.getOrDefault(subdomain, 0) + count);
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : visitCounts.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(subdomainVisits(arr));
    }

}

// ["901 mail.com", "50 yahoo.com", "900 google.mail.com", "5 wiki.org", "5 org", "1 intel.mail.com", "951 com"]