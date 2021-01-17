import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

        // read the CSV file and convert to HTML Table
        createTable(file);

    }

    public static File getFile() {
        JFileChooser jfc = new JFileChooser();

        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                return jfc.getSelectedFile();
        }
        return jfc.getSelectedFile();
    }

    static void createTable(File f) {
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String table = "";
            FileWriter writer = new FileWriter("table.html");

            String line = "";
            String [] cells;
            while ((line = br.readLine()) != null) {
                cells = line.split(",");

                if (table == "") {
                    table = "<!DOCTYPE html>\n<html>\n<table>\n<tr>\n";
                    for (String cell : cells) {
                        table += "<th>" + cell + "</th>\n";
                    }
                    table += "</tr>\n";
                }
                else {
                    table += "<tr>\n"; // open the row
                    for (String cell : cells) {
                        table += "<td>" + cell + "</td>\n";
                    }
                    table += "</tr>\n"; // close the row
                }
            }
            table += "</table>\n</html>\n";
            System.out.println(table);
            writer.write(table);
            writer.close();

            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}