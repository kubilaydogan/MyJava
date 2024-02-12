package Konular;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Konu_NumberFormat2 {
    public static void main(String[] args) throws ParseException {

        BigDecimal price = BigDecimal.valueOf(2.99);
        Double tax = 0.2;
        int quantity = 12478;

//        Locale locale = new Locale("tr", "TR");
        Locale locale = new Locale("en", "GB");

        NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentage = NumberFormat.getPercentInstance(locale);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

        String fPrice = currency.format(price);
        String fTax = currency.format(tax);
        String fQuantity = currency.format(quantity);

        System.out.println(fPrice + " -- " + fTax + " -- " + fQuantity);      // £2.99 -- £0.20 -- £12,478.00
                                                                              // ₺2,99 -- ₺0,20 -- ₺12.478,00


//        BigDecimal newPrice = (BigDecimal) currency.parse("£1.75");
        Double newTax = (Double) percentage.parse("12%");
        int newQuantity = numberFormat.parse("64,778").intValue();

//        System.out.println(newPrice);
        System.out.println(newTax);         //0.12
        System.out.println(newQuantity);    // 64778




    }
}
