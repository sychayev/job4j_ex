package ex;

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {null,"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int i = 0; i < shops.length; i++) {
            String el = shops[i];
            if (el != null) {
                if (el.length() > max) ;
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }

}

