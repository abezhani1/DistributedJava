package bezhani;

import java.util.ArrayList;
import java.util.List;

public class EventListExpert {
    private static List<Masquerade> events = new ArrayList<>();

    private static EventListExpert single_instance = null;

    public EventListExpert()
    {

        if (single_instance == null)
        {
            events.add(new Masquerade("01-001", "Seating", "5:00 PM"));
            events.add(new Masquerade("01-002", "Guest Speaker", "5:15 PM"));
            events.add(new Masquerade("01-003", "Dinner", "6:00 PM"));
            events.add(new Masquerade("01-004", "Dancing", "7:00 PM"));
            events.add(new Masquerade("01-005", "Mask Contest", "9:00 PM"));
            events.add(new Masquerade("01-006", "Dancing", "10:00 PM"));
            single_instance = this;
        }

    }

    public List<Masquerade> getToDo() {
        return events;
    }

    public List<Masquerade> getEventsRemaining() {
        List<Masquerade> eventsRemaining = new ArrayList<>();
        for (Masquerade m: events) {
            if (m.isFeatured()) {
                eventsRemaining.add(m);
            }
        }
        return eventsRemaining;
    }

    //to cycle through the events and delete accordingly
    public void deleteRecord(String eventName) {
        for(int i = 0; i < events.size(); i++){
            if(((Masquerade)events.get(i)).getEventName().contains(eventName)) {
                events.remove(i);
            }
        }
    }

    public void addEvent(String eventNumber, String eventName, String eventTime) {
        events.add(new Masquerade(eventNumber, eventName, eventTime));
    }

    @Override
    public String toString() {
        return "TaskExpert{" +
                "toDo=" + events +
                '}';
    }

}
