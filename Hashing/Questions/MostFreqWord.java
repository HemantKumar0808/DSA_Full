package HashMap.Questions;

import java.util.*;

class Solution {
    public void mostFrequent(String[] arr, int n) {
        // Frequency map to store word count
        HashMap<String, Integer> freqMap = new HashMap<>();
        // Map to store the last occurrence of each word
        HashMap<String, Integer> lastOccurrence = new HashMap<>();

        // Count frequency and record last occurrence index
        for (int i = 0; i < n; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            lastOccurrence.put(arr[i], i); // Track the last occurrence of the word
        }

        // Find the most frequent word
        String ans = "";
        int maxFreq = 0;
        int lastIndex = -1;

        // Iterate through frequency map
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            String word = entry.getKey();
            int freq = entry.getValue();
            int index = lastOccurrence.get(word);

            // Check for maximum frequency or handle tie-breaking
            if (freq > maxFreq || (freq == maxFreq && index > lastIndex)) {
                maxFreq = freq;
                lastIndex = index;
                ans = word;
            }
        }

        // Print the most frequent word
        System.out.println(ans);
    }
}

// Main class to execute the code
public class MostFreqWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline after reading n
        String[] arr = sc.nextLine().split(" ");

        // Create object and call method
        Solution Obj = new Solution();
        Obj.mostFrequent(arr, n);
    }
}
