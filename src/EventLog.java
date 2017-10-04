import java.util.ArrayList;
import java.util.List;

public class EventLog {

    public EventLog() {
        eventList = new ArrayList<>();
    }

    private List<Event> eventList;

    public boolean addEvent(Event event) throws IllegalArgumentException {
            if (event == null || event.name == null || event.action == null){
                throw new IllegalArgumentException();
            } else if ((!(event.getAction() == "Face2Face") && !(event.getAction() == "PhoneCall") && !(event.getAction() == "TextMessaging") && !(event.getAction() == "Unknown"))) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("Here's the new event: " + event);
                eventList.add(event);
            }
        return true;
//        if (event == null || event.name == null || event.action == null){
//            throw new IllegalArgumentException();
//        } else if (event.action != eventActionOptions){
//
//        } else{
//            System.out.println("Here's the new event: " + event);
//            eventList.add(event);
//        }
//        return true;
    }

    public int getNumEvents(){
        return eventList.size();
    }

}
