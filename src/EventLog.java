import java.util.ArrayList;
import java.util.List;

public class EventLog {

    public EventLog() {
        eventList = new ArrayList<>();
    }

    private List<Event> eventList;

    public boolean addEvent(Event event){
        if (event == null || event.name == null || event.action == null){
            throw new IllegalArgumentException("must have a name and action");
        } else {
            System.out.println(event);
            eventList.add(event);
            return true;
        }
    }

    public int getNumEvents(){
        return eventList.size();
    }

}
