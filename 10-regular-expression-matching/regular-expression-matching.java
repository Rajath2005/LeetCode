class Solution {

    boolean solve(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;

        }

        boolean first_character_matched = false;
        if (s.length() > 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
            first_character_matched = true;
        }
        if (p.length() >= 2 && p.charAt(1) == '*') {
            boolean not_take = solve(s, p.substring(2));
            boolean take = first_character_matched && solve(s.substring(1), p);

            return not_take || take;
        }
        return first_character_matched &&
                solve(s.substring(1), p.substring(1));
    }

    public boolean isMatch(String s, String p) {
        return solve(s, p);
    }
}