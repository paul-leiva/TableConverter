import java.io.File;
import javax.swing.JFileChooser;

class TableConverter {

    public static void main (String [] args) {
        System.out.println("Select a CSV File:");

        // get the file
        File file = new File("");
        file = getFile();

        if (!file.getName().endsWith(".csv")) { // if CSV file is not selected
            System.out.println("You did NOT select a CSV file. Try again!");
            System.exit(0); // Terminate the program
        }

        System.out.println("The file " + file.getName() + " has been selected.");

        // read the CSV file

        // convert CSV contents into an HTML Table

    }

    public static File getFile() {
        JFileChooser jfc = new JFileChooser();

        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                return jfc.getSelectedFile();
        }
        return jfc.getSelectedFile();
    }
}