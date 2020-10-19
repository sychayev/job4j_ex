package ex;

import javax.management.StringValueExp;

public class FindEl {
    public static int indexOf(String[] value, String key)
            throws ElementNotFoundException {
        int rsl = -1;
        for (String s : value) {
        if (s !="b"){
            System.out.println();
        }
        }
        return rsl;
    }

    public static void main(String[] args)
            throws ElementNotFoundException {
        String s [] = new String []{"a","b","c",null};
        try{
            FindEl.indexOf(s,"b");
        }catch(ElementNotFoundException e){
            e.printStackTrace();
        }
    }
}
