import java.util.ArrayList;
import java.util.List;

public class Notepad {
  private List<String> notesList = new ArrayList<>();

  public Notepad() {
  }

  public void addNote(String note) {
    notesList.add(note);
  }
  public void printNote(int index) {
    String note = notesList.get((index - 1));
    System.out.println("Notatka " + index + " : " + note);
  }

  public void list() {
    int counter  = 1;
    String header = "";
    for (String note: notesList ) {
      StringBuilder stringBuilder = new StringBuilder();
      if (note.length() > 20) {
        header = note.substring(0,19);
      } else {
        header = note;
      }
      stringBuilder.append(counter + ". ").append(header);
      if (note.length() > 20) {
        stringBuilder.append("...");
      }
      System.out.println(stringBuilder.toString());
      counter++;
    }
  }

  public void delete(int index) {
    notesList.remove(index-1);
  }
}
