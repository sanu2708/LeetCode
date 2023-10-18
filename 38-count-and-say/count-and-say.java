class Solution {
    public String countAndSay(int n) {
    if (n == 1) {
        return "1";
    }

    String result = "1";
    for (int i = 2; i <= n; i++) {
        result = generateNextCountAndSay(result);
    }

    return result;
}

private String generateNextCountAndSay(String s) {
    StringBuilder sb = new StringBuilder();
    int count = 1;

    for (int i = 0; i < s.length(); i++) {
        if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
            count++;
        } else {
            sb.append(count).append(s.charAt(i));
            count = 1;
        }
    }

    return sb.toString();
}

}