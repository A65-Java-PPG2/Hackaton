package Skeleton.tests.com.company.core.strings;

import Skeleton.src.com.company.core.strings.StringHelpers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PadStart {
    
    @Test
    @DisplayName("padStart() returns a padded string")
    public void padStart() {
        //Arrange
        String source = "Company";
        char paddingSymbol = '-';
        String expected = "---Company";
        
        //Act
        String result = StringHelpers.padStart(source,
                expected.length(),
                paddingSymbol);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("padStart() returns empty string when given empty string")
    public void padStart_returnsEmptyString_when_givenEmptyString() {
        //Arrange
        String source = "";
        char paddingSymbol = '-';
        String expected = "";
        
        //Act
        String result = StringHelpers.padStart(source,
                expected.length(),
                paddingSymbol);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("padStart() returns source when source is longer than length")
    public void padStart_returnsSource_when_sourceIsLonger() {
        //Arrange
        String source = "Company";
        char paddingSymbol = '-';
        String expected = "Company";
        
        //Act
        String result = StringHelpers.padStart(source,
                1,
                paddingSymbol);
        
        //Assert
        Assertions.assertEquals(expected, result);
    }
    
}
