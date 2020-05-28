import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class returnEveryNthCharToANewStringTest {

    @Test
    public void everyNth() {

        Assert.assertEquals("Cla", returnEveryNthCharToANewString.everyNth("Chelsea", 3));
        Assert.assertEquals("Geoy", returnEveryNthCharToANewString.everyNth("Gregory", 2));
        Assert.assertEquals("Ai", returnEveryNthCharToANewString.everyNth("April", 3));
        Assert.assertEquals("Zba", returnEveryNthCharToANewString.everyNth("Zebra", 2));
        Assert.assertEquals("Error.", returnEveryNthCharToANewString.everyNth("April", 6));
    }
}
