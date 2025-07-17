import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            //frame
            Frames frame = new Frames("IIT FOOTBALL TEAM REGISTRATION", 800, 700);

            //name
            Labels name = new Labels("Name: ", 30, 20, 100, 25);
            TextFields nameField = new TextFields(150, 20, 250, 25);
            frame.add(name);
            frame.add(nameField);

            //phone
            Labels phone = new Labels("Phone: ", 30, 70, 100, 25);
            TextFields phoneField = new TextFields(150,70,250,25);
            frame.add(phone);
            frame.add(phoneField);

            //email
            Labels email = new Labels("Email: ", 30, 120, 100, 25);
            TextFields emailField = new TextFields(150, 120, 250, 25);
            frame.add(email);
            frame.add(emailField);

            //gender
            Labels gender = new Labels("Gender: ", 30, 170, 100, 25);
            RadioButtons male = new RadioButtons("Male", 150, 170,  100, 25);
            RadioButtons female = new RadioButtons("Female", 230, 170, 100, 25);
            ButtonAdder genderGroup = new ButtonAdder();
            genderGroup.add(male);
            genderGroup.add(female);
            frame.add(gender);
            frame.add(male);
            frame.add(female);

            //date of birth
            Labels dob = new Labels("Date of Birth: ", 30, 220, 150, 25);
            String[] days = new String[31];
            for(int i=1;i<=31;i++) days[i-1] = String.valueOf(i);
            String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
            String[] years = new String[100];
            for(int i=0;i<100;i++) years[i] = String.valueOf(2025 - i);
            ComboBoxes dayBox = new ComboBoxes(days, 150, 220, 70, 25);
            ComboBoxes monthBox = new ComboBoxes(months, 240, 220, 70, 25);
            ComboBoxes yearBox = new ComboBoxes(years, 330, 220, 70, 25);
            frame.add(dob);
            frame.add(dayBox);
            frame.add(monthBox);
            frame.add(yearBox);

            //degree
            Labels degree = new Labels("Degree: ", 30, 270, 100, 25);
            String[] degrees = {"BSSE", "MSSE"};
            ComboBoxes degreeBox = new ComboBoxes(degrees, 150, 270, 70, 25);
            frame.add(degree);
            frame.add(degreeBox);

            //file upload
            Labels fileLabel = new Labels("Photo: ", 30, 320, 100, 25);
            Buttons fileButton = new Buttons("Choose file", 150,320,120,25);
            Labels filePathLabel = new Labels(280,320,180,25);
            frame.add(filePathLabel);
            frame.add(fileLabel);
            frame.add(fileButton);
            final String[] selectedFilePath = {""};

            //image preview
            JLabel imagePreview = new JLabel("No image");
            imagePreview.setHorizontalAlignment(JLabel.CENTER);
            imagePreview.setVerticalAlignment(JLabel.CENTER);
            imagePreview.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            imagePreview.setBounds(480, 300, 100, 100);
            frame.add(imagePreview);

            //file button
            fileButton.addActionListener(e -> {
                FileChooser fileChooser = new FileChooser();
                int option = fileChooser.showOpenDialog(frame);
                if(option == FileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    selectedFilePath[0] = file.getAbsolutePath();

                    try {
                        BufferedImage img = ImageIO.read(file);
                        if (img != null) {
                            Image scaled = img.getScaledInstance(imagePreview.getWidth(), imagePreview.getHeight(), Image.SCALE_SMOOTH);
                            imagePreview.setIcon(new ImageIcon(scaled));
                            imagePreview.setText("");
                            filePathLabel.setText(file.getName());
                        } else {
                            imagePreview.setIcon(null);
                            imagePreview.setText("No image");
                            filePathLabel.setText("");
                            selectedFilePath[0] = "";
                            JOptionPane.showMessageDialog(frame, "Selected file is not a valid image.", "Invalid Image", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (IOException ex) {
                        imagePreview.setIcon(null);
                        imagePreview.setText("No image");
                        filePathLabel.setText("");
                        selectedFilePath[0] = "";
                        JOptionPane.showMessageDialog(frame, "Error reading the selected file.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            //game related info
            Labels posLabel = new Labels("Position: ", 30,370,100,25);
            String[] pos = {"GK", "CB", "RB", "LB", "RWB", "LWB", "CDM","RDM", "LDM", "CM", "RM", "LM", "CAM", "RAM", "LAM", "SS", "LW", "RW", "CF", "RF", "LF"};
            ComboBoxes posBox = new ComboBoxes(pos, 150, 370, 250,25);
            frame.add(posBox);
            frame.add(posLabel);

            //experience
            Labels experienceLabel = new Labels("Let us know about your footballer journey fella: ", 30, 420, 450, 25);
            TextArea experienceDescription = new TextArea();
            ScrollPane scroller = new ScrollPane(experienceDescription, 30, 470, 350,100);
            frame.add(experienceLabel);
            frame.add(scroller);

            //submit button
            Buttons submitButton = new Buttons("Submit", 30, 600, 100, 25);
            frame.add(submitButton);
            submitButton.addActionListener(e -> {
                String nameVal = nameField.getText().trim();
                String phoneVal = phoneField.getText().trim();
                String emailVal = emailField.getText().trim();
                String genderVal = male.isSelected() ? "Male" : (female.isSelected()) ? "Female" : "";
                String dobVal = dayBox.getSelectedItem() + "-" + monthBox.getSelectedItem() + "-" + yearBox.getSelectedItem();
                String degreeVal = (String) degreeBox.getSelectedItem();
                String fileVal = selectedFilePath[0];
                String posVal = (String) posBox.getSelectedItem();
                String experienceVal = experienceDescription.getText().trim();

                StringBuilder error = new StringBuilder();
                if(nameVal.isEmpty()) error.append("Name required!\n");
                if(phoneVal.isEmpty()) error.append("Phone required!\n");
                if(emailVal.isEmpty()) error.append("Email required!\n");
                if(genderVal.isEmpty()) error.append("Select gender!\n");
                if(degreeVal == null || degreeVal.isEmpty()) error.append("Select degree!\n");
                if(fileVal == null || fileVal.isEmpty()) error.append("Select a photo file!\n");
                if(posVal == null || posVal.isEmpty()) error.append("Select a position!\n");
                if(experienceVal.isEmpty()) error.append("Tell us about your footballer journey!\n");

                if(!error.isEmpty()) {
                    javax.swing.JOptionPane.showMessageDialog(frame, error.toString(), "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    java.io.FileWriter fw = new java.io.FileWriter("FootballRegistration.txt", true);
                    java.io.PrintWriter writer = new java.io.PrintWriter(fw);

                    writer.println("------ NEW SUBMISSION ------");
                    writer.println("Name: " + nameVal);
                    writer.println("Phone: " + phoneVal);
                    writer.println("Email: " + emailVal);
                    writer.println("Gender: " + genderVal);
                    writer.println("Date of Birth: " + dobVal);
                    writer.println("Degree: " + degreeVal);
                    writer.println("Photo File: " + fileVal);
                    writer.println("Position: " + posVal);
                    writer.println("Experience: " + experienceVal);
                    writer.println();

                    writer.close();
                    fw.close();

                    javax.swing.JOptionPane.showMessageDialog(frame, "Submission successful!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                    nameField.setText("");
                    phoneField.setText("");
                    emailField.setText("");
                    genderGroup.clearSelection();
                    dayBox.setSelectedIndex(0);
                    monthBox.setSelectedIndex(0);
                    yearBox.setSelectedIndex(0);
                    degreeBox.setSelectedIndex(0);
                    posBox.setSelectedIndex(0);
                    selectedFilePath[0] = "";
                    filePathLabel.setText("");
                    experienceDescription.setText("");
                    imagePreview.setIcon(null);
                    imagePreview.setText("No image");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(frame, "Error saving file.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            });
        });
    }
}