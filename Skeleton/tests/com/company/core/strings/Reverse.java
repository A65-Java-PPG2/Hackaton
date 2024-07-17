package Skeleton.tests.com.company.core.strings;

import Skeleton.src.com.company.core.strings.StringHelpers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Reverse {
    
    @Test
    @DisplayName("reverse() reverses the given string")
    public void reverse() {
        //Arrange
        String word = "Company";
        String expected = "ynapmoC";
        
        //Act
        String result = StringHelpers.reverse(word);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
}
