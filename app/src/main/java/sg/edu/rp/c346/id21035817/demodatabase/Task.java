package sg.edu.rp.c346.id21035817.demodatabase;

public class Task {
    private int id;
    private String description;
    private String date;

    public Task(int id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public int getId() { return id; }

    public String getDescription() { return description; }

    public String getDate() { return date;}

    @Override
    public String toString() {
        return id + "\n" + description + "\n" + date;
    }
}
