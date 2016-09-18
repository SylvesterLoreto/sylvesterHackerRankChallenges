package net.sylvestertech.java.easy.loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaLoopsTwoTest {

    @Test
    public void queryValueIsGreaterThanZero() throws Exception {
        final JavaLoopsTwo javaLoopsTwo = new JavaLoopsTwo(4);
        assertEquals(4, javaLoopsTwo.getQueryValue());
    }
}
