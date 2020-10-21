package ex;

import javax.management.StringValueExp;
import java.util.Arrays;

public class FindEl {
    public static int indexOf(String[] value, String key)
            throws ElementNotFoundException {
        int rsl = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
               rsl = i;
               break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found!");

        }
        System.out.println(rsl);
        return rsl;
    }
    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
//         if contains throw ElementAbuseException
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void main(String[] args)
            throws ElementNotFoundException {
        String s1[] = new String[]{"a", "b", "c", null};
        try {
            FindEl.indexOf(s1, "a");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
