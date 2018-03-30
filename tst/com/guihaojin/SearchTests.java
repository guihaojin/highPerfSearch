package com.guihaojin;

import org.junit.Assert;
import org.junit.Test;

public class SearchTests {
    @Test
    public void stringSearchTest() {
        String target = "hello world";
        StringSearch stringSearch = new StringSearch(target);

        String text1 = "for your foo bar, helo world";
        String text2 = "for your foo bar, hello world!";
        Assert.assertFalse(stringSearch.BMSearch(text1));
        Assert.assertTrue(stringSearch.BMSearch(text2));
    }
}
