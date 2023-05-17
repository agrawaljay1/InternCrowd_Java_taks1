import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Resume Builder");
        System.out.println("----------------");

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.println("\nResume Summary");
        System.out.println("----------------");
        System.out.print("Enter a brief summary of your qualifications: ");
        String summary = scanner.nextLine();

        System.out.println("\nEducation");
        System.out.println("----------------");
        System.out.print("Enter your educational background: ");
        String education = scanner.nextLine();

        System.out.println("\nExperience");
        System.out.println("----------------");
        System.out.print("Enter your work experience: ");
        String experience = scanner.nextLine();

        System.out.println("\nSkills");
        System.out.println("----------------");
        System.out.print("Enter your skills: ");
        String skills = scanner.nextLine();

        System.out.println("\nReferences");
        System.out.println("----------------");
        System.out.print("Enter your references: ");
        String references = scanner.nextLine();

        // Generate the resume content
        StringBuilder resumeContent = new StringBuilder();
        resumeContent.append("╔═══════════════════════════════════════════════╗\n");
        resumeContent.append("║                   Resume                      ║\n");
        resumeContent.append("╚═══════════════════════════════════════════════╝\n\n");
        resumeContent.append("Name: ").append(fullName).append("\n");
        resumeContent.append("Email: ").append(email).append("\n");
        resumeContent.append("Phone: ").append(phone).append("\n");
        resumeContent.append("Address: ").append(address).append("\n\n");
        resumeContent.append("Summary:\n").append(summary).append("\n\n");
        resumeContent.append("Education:\n").append(education).append("\n\n");
        resumeContent.append("Experience:\n").append(experience).append("\n\n");
        resumeContent.append("Skills:\n").append(skills).append("\n\n");
        resumeContent.append("References:\n").append(references).append("\n");

        // Save the resume content to a text file
        String outputFilePath = "resume.txt";
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            writer.write(resumeContent.toString());
            System.out.println("Resume successfully saved to: " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
