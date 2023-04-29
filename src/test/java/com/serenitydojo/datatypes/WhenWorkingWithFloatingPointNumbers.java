package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    //
    // Exercise 1: Convert 27 degrees Celcius to Farenheit
    // The equation is: farenheit = (9 / 5) * celcius + 32
    //
    @Test
    public void convertToFarenheit() {
        double celcius = 27.0d;
        double farenheit = 0.0d;

        float newFarenheit;
        newFarenheit = (float) (celcius * 1.8) + 32;


        System.out.println(farenheit);
        System.out.println(newFarenheit);
        // TODO: Use a floating point calculation to calculate the farenheit equivalent of the celcius value.

        assertThat(newFarenheit, equalTo(80.6F));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertKilogramsToPounds() {
        int weightInKilograms = 50;
        double weightInPounds = 0;

        weightInPounds = (float) weightInKilograms * 2.20462;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds

        System.out.println(weightInPounds);
        assertThat(weightInPounds, equalTo(110.231));

    }
}
