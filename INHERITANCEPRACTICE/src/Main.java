public class Main {
    public static void main(String[] args) {

        ConferenceEvent conferenceEvent = new ConferenceEvent(
            "001", "Oulu Conference", "University", "Alice",
            20000.0, 300, 3, true, 15.0 * 300, true, 30.0 * 300, true, 45.0 * 300);

        MusicConcertEvent musicConcertEvent = new MusicConcertEvent(
            "002", "Happy", "Stadium", "Alice",
            15000.0, 5000, 1, true, 10.0 * 5000);

        System.out.println("Conference Event Details:");
        System.out.println(conferenceEvent);
        System.out.println("Total Conference Event Cost: $" + conferenceEvent.calculateEventCost());

        System.out.println("\nMusic Concert Event Details:");
        System.out.println(musicConcertEvent);
        System.out.println("Total Music Concert Event Cost: $" + musicConcertEvent.calculateEventCost());
    }
}
