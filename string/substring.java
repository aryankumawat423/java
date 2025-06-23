// User function Template for Java

class substring {
    public static void substring(String s) {
        // code here
        for(int i=0;i<s.length();i++){
            for(int end=i+1;end<=s.length();end++){
                System.out.println(s.substring(i,end));
            }
        }
    }

public static void main(String[] args) {
        String s = "abc";
        substring(s);
    }
}