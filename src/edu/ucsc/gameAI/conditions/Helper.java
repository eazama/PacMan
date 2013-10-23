/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.conditions;

/**
 *
 * @author Eric
 */
public class Helper {

    public static boolean withinRangeInclusive(int min, int max, int test) {
        return min <= test && max >= test;
    }

    public static boolean withinRangeNonInclusive(int min, int max, int test) {
        return min < test && max > test;
    }
}
