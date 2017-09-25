import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EventLogTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up..");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Cleaning up..");
    }

    @Test
    public void addEvent() throws Exception {
//        if the name and action is null
        assertFalse(EventLog.addEvent());
    }

    @Test
    public void getNumEvents() throws Exception {
    }

}