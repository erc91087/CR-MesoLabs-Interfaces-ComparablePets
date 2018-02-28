package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class PetTest {
    @Test
    public void testCompareSamePetTypeSameName() {
        Pet dog1 = new Dog("Charlie");
        Pet dog2 = new Dog("Charlie");

        int expected = 0;
        int actual = dog1.compareTo(dog2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareDiffPetTypePositive() {
        Pet dog = new Dog("Charlie");
        Pet cat = new Cat("Sylvester");

        int expected = 1;
        int actual = dog.compareTo(cat);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareDiffPetTypeNegative() {
        Pet rabbit = new Rabbit("Bugs");          //type 1
        Pet cat = new Cat("Sylvester");   //type 2

        int expected = -1;
        int actual = cat.compareTo(rabbit);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareSamePetTypeDiffNamePositive() {
        Pet first = new Dog("Charlie");
        Pet second = new Dog("Kylie");

        int expected = 1;
        int actual = first.compareTo(second);
//        Collections.sort(listName);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareSamePetTypeDiffNameNegative() {
        Pet first = new Dog("Charlie");
        Pet second = new Dog("Kylie");

        int expected = -1;
        int actual = second.compareTo(first);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {

    }
}
