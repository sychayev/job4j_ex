package ex;

import javax.management.StringValueExp;
import java.util.Arrays;

public class FindEl {
    public static int indexOf(String[] value, String key)
            throws ElementNotFoundException {
        int rsl = -1;
        for (String s : value) {
            if (null == value) {
                throw new ElementNotFoundException("Element not found!");
            } else {
                System.out.println(s);
            }
        }
        return rsl;
    }

    public static void main(String[] args)
            throws ElementNotFoundException {
        String s1[] = new String[]{"a", "b", "c", null};
        try {
            FindEl.indexOf(s1, null);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
