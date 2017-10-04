import org.junit.After;
import org.junit.Assert;
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
//        if neither name or action are null
        Event eventZero = new Event("Test Event", "Face2Face");

//        if the name is null but action is not null
        Event eventOne = new Event(null, "Face2Face");

//        if both name and action is null
        Event eventTwo = new Event(null, null);

//        if the name is not null but the action is null
        Event eventThree = new Event("Name of event", null);

//        if action is not listed
        Event eventFour = new Event("Call me", "Never");

        EventLog parties = new EventLog();

        try {
            assertTrue(parties.addEvent(eventZero));
        } catch (Exception ex) {
            fail("Should never reach this point.");
        }

        try {
            parties.addEvent(eventOne);
            fail("Should never reach this point.");
        } catch (Exception ex) {
            assertTrue(true);
        }

        try {
            parties.addEvent(eventTwo);
            fail("Should never reach this point.");
        } catch (Exception ex) {
            assertTrue(true);
        }

        try {
            parties.addEvent(eventThree);
            fail("Should never reach this point.");
        } catch (Exception ex) {
            assertTrue(true);
        }

        try {
            parties.addEvent(eventFour);
            fail("Should never reach this point");

        } catch (Exception ex){
            assertTrue(true);
        }


    }

    @Test
    public void getNumEvents() throws Exception {
        EventLog parties = new EventLog();

        Event eventZero = new Event("Test Event", "Face2Face");
        Event eventOne = new Event("Event Tester", "PhoneCall");
        Event eventTwo = new Event("Testing Event", "TextMessaging");

        parties.addEvent(eventZero);
        parties.addEvent(eventOne);
        parties.addEvent(eventTwo);

        try{
            assertEquals(3, parties.getNumEvents());
        } catch (Exception x){
            assertFalse(false);
            fail("Did not work");
        }

    }

}