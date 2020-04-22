package com.demo.nopcommerce.testData;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "Login Data")
    public Object [][] getData(){
        return new Object[][]{
                {"abc123def456@yahoo.com", "Nikita1418"},
                {"abc123@gmail.com","12345"},
                {"nikita@hotmail.com","a1b2c3d4"}
        };
    }

    @DataProvider(name = "Registration Data")
    public Object[][] getData1(){
        return new Object[][]{
                {"Taj", "Mahal", "1", "July", "1986", "abc@yahoomail.com", "Physio Care", "Tajmahal06", "Tajmahal06"}

        };
    }
}
