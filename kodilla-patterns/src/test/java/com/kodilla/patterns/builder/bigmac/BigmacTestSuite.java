package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Toasted bread roll")
                .burgers(3)
                .sauce("Thousand Island dressing")
                .ingredients("Pickled cucumber")
                .ingredients("Iceberg lettuce")
                .ingredients("onion")
                .build();

        System.out.println(bigmac);

        //When
        int howManyngredients = bigmac.getIngredients().size();
        String whatBun = bigmac.getBun();
        String whatSauce = bigmac.getSauce();
        int howManyBurgers = bigmac.getBurgers();


        //Then
        Assert.assertEquals(3,howManyngredients);
        Assert.assertEquals("Toasted bread roll" ,whatBun);
        Assert.assertEquals("Thousand Island dressing" ,whatSauce);
        Assert.assertEquals(3,howManyBurgers);
    }
}
