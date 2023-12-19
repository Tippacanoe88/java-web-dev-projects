package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void severalSetsOfEmptyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketsThenPhraseReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]launchcode"));
    }
    @Test
    public void codeInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("launch[code]"));
    }
    @Test
    public void phraseInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void onlyOneSideBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void onlyOneClosingBracketReturnsFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));}
    @Test
    public void oppositeFacingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void onlyOpeningBracketREturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void onlyOpposingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}