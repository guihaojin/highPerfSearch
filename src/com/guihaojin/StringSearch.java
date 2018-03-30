package com.guihaojin;

public class StringSearch {

    public StringSearch(String target) {
        this.target = target;
        // preprocess target
        for(int c = 0; c < 256; c++) {
            right[c] = -1;
        }
        for(int i = 0; i < target.length(); i++) {
            right[target.charAt(i)] = i;
        }
    }

    public boolean BMSearch(String text) {
        // search
        int m = target.length();
        int n = text.length();
        int skip;
        for (int i = 0; i <= n - m; i += skip) {
            skip = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (target.charAt(j) != text.charAt(i+j)) {
                    skip = Math.max(1, j - right[text.charAt(i+j)]);
                    break;
                }
            }
            if (skip == 0) return true;
        }
        return false;
    }

    private int[] right = new int[256];
    private String target;
}
