package ex;

import javax.management.StringValueExp;
import java.util.Arrays;

public class FindEl {
    public static int indexOf(String[] value, String key)
            throws ElementNotFoundException {
        int rsl = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                String rsl1 = Integer.toString(rsl);
                rsl1.equals(value[i]);
            } else if (rsl == -1) {
                throw new ElementNotFoundException("Element not found!");

            }
        }
        return rsl;
    }

    public static void main(String[] args)
            throws ElementNotFoundException {
        String s1[] = new String[]{"a", "b", "c", null};
        try {
            FindEl.indexOf(s1, "b");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
