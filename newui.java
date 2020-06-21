import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JTable;

class newjava {
    public static void main(String[] args) {
       
        HashMap<String, Integer> mapDay = new HashMap<String, Integer>();
        
        mapDay.put("MD", 1);
        mapDay.put("TD", 2);
        mapDay.put("WED", 3);
        mapDay.put("THUR", 4);
        mapDay.put("FRI", 5);
        mapDay.put("SAT", 6);
        
        HashMap<String, Integer> mapTime = new HashMap<String, Integer>();

        mapTime.put("8:30-9:30", 1);
        mapTime.put("9:30-10:30", 2);
        mapTime.put("10:30-11:30", 3);
        mapTime.put("11:30-12:30", 4);
        mapTime.put("12:30-1:30", 5);

        JFrame f = new JFrame("Time Table");
        JTable t = new JTable(6,7);
        t.setBounds(50, 50, 100, 100);

        t.setValueAt("Monday", 0, 1);
        t.setValueAt("Tuesday", 0, 2);
        t.setValueAt("Wednesday", 0, 3);   
        t.setValueAt("Thursday", 0, 4);
        t.setValueAt("Friday", 0, 5);
        t.setValueAt("Saturday", 0, 6);

        t.setValueAt("8:30-9:30", 1, 0);
        t.setValueAt("9:30-10:30", 2, 0);
        t.setValueAt("10:30-11:30", 3, 0);
        t.setValueAt("11:30-12:30", 4, 0);
        t.setValueAt("12:30-1:30", 5, 0);

        // SQL Query Here 
        String dayTime = "WED 11:30-12:30";
        String[] splitString = dayTime.split("\\s");

        t.setValueAt("Mr. Prashant Shivhare", mapTime.get(splitString[1]), mapDay.get(splitString[0]));

        f.add(t);
        f.setSize(800, 500);
        f.setVisible(true);
    }
}