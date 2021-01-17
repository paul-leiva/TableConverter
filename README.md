# TableConverter
This program takes a *.csv* file (comma-separated values file) as input and converts the file into equivalent HTML code for the table. A *.csv* file is a lot like an Excel workbook, but the values are stored in a file where each cell is separated by a comma (','). This makes it easy for file reading/writing processes.

This project was submitted to [SB Hacks VII](https://sb-hacks-vii.devpost.com/) (a 2021 MLH hackathon put on by University of California, Santa Barbara/UCSB). [Devpost](https://devpost.com/software/tableconverter)

# How it works
1. Run `TableConverter.java`.
2. You will be prompted to select your .csv file from the file chooser. The file can be in any directory. This repository includes `sample.csv` which is an example of a .csv file that contains data about tech companies. You can use this file as an example if you don't have one.

![Input](/IO.gif?raw=true)

3. Then, `TableConverter.java` will convert your .csv file into a file called `table.html` in this directory.
4. Open `table.html` (in a web browser or in a text editor) and you should see your .csv file converted into equivalent HTML code.

# Sample Input
`sample.csv` file contents (you can use your own .csv, this one is just an example):

![Input](/input_file.jpg?raw=true)

# Sample Output
`table.html` output (Webpage and HTML file/code):

![Output](/output.jpg?raw=true)
