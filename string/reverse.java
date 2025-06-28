class reverse{
    public static String reversee(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() / 2; i++) {
            char start = sb.charAt(i);
            char end = sb.charAt(sb.length() - 1 - i);
            sb.setCharAt(i, end);
            sb.setCharAt(sb.length() - 1 - i, start);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reversee(s));  // Output: cba
    }
}
