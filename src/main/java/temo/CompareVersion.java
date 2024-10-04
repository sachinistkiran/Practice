package temo;

public class CompareVersion {
    public static void main(String[] args) {
        String v1 = "1.2.27.5";
        String v2 = "1.2.27.1";

        CompareVersion cv = new CompareVersion();
        System.out.println(cv.compareVersion(v1, v2));
    }

    private String compareVersion(String s1, String s2) {
        String latestVersion = "";
//        String v1[] = s1.split("\\.");
//        String v2[] = s2.split("\\.");
        if (s1.length() != s2.length()) {
            return "Invalid";
        }
        for (int i = 0; i <= s1.length() - 1; i++) {
//            if (Integer.parseInt(v1[i]) == Integer.parseInt(v2[i])) {
//                latest = Integer.parseInt(v1[i]);
//            } else {
//                latest = Math.max(Integer.parseInt(v1[i]), Integer.parseInt(v2[i]));
//            }
//            latestVersion = latestVersion + "." + latest;
            if (s1.charAt(i) == '.') {
                continue;
            }
            int ver1 = Integer.parseInt(s1.substring(i, i + 1));
            int ver2 = Integer.parseInt(s2.substring(i, i + 1));
//            if (ver1 == ver2) {
//                continue;}
            if (ver1 > ver2) {
                latestVersion = s1;
                break;
            } else if (ver1 < ver2) {
                latestVersion = s2;
                break;
            } else {
                latestVersion = s1;
            }
        }
        return latestVersion;
    }
}
