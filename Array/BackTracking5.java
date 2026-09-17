// Distinct Permutations of a String
// Given a string s, which may contain duplicate characters, generate all possible unique permutations of the string.

// Note: You may return the permutations in any order.

// Examples:

// Input: s = "ABC"
// Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
// Explanation: Given string ABC has 6 unique permutations.

class Solution {

    static ArrayList<String> findPermutation(String s) {

        ArrayList<String> result = new ArrayList<>();

        Permutation(s, result, "");

        return result;
    }

    public static void Permutation(
        String str,
        ArrayList<String> result,
        String perm
    ) {

        // Base case
        if (str.length() == 0) {
            result.add(perm);
            return;
        }

        // Characters already used at this level
        Set<Character> used = new HashSet<>();

        // Try every character
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // Skip duplicate character
            if (used.contains(curr)) {
                continue;
            }

            used.add(curr);

            // Remove current character
            String newStr =
                str.substring(0, i) +
                str.substring(i + 1);

            // Recursive call
            Permutation( 
                newStr,
                result,
                perm + curr
            );
        }
    }
}