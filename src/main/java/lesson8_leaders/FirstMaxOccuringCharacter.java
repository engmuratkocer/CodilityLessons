package lesson8_leaders;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMaxOccuringCharacter
{


    @Test
    public void test1(){
        assertEquals("d", solution("abcdd"));
    }

    @Test
    public void test2(){
        assertEquals("a", solution("abcd"));
    }

    @Test
    public void test3(){
        assertEquals("a", solution("aabb"));
    }


    String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    }


}
