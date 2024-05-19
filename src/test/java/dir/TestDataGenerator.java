package dir;

import dir.model.NoteData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDataGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество тестовых данных:");
        int count = scanner.nextInt();

        System.out.println("Введите путь для сохранения файла (включая имя файла и расширение .xml):");
        scanner.nextLine(); // consume newline
        String filePath = scanner.nextLine();

        generateTestData(count, filePath);

        System.out.println("Тестовые данные успешно сгенерированы и сохранены в файл " + filePath);
    }

    public static void generateTestData(int count, String filePath) {
        List<NoteData> noteDataList = generateNoteData(count);

        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xmlBuilder.append("<notedata>\n");

        for (NoteData noteData : noteDataList) {
            xmlBuilder.append("    <note>\n");
            xmlBuilder.append("        <title>").append(noteData.getName()).append("</title>\n");
            xmlBuilder.append("    </note>\n");
        }

        xmlBuilder.append("</notedata>");

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(xmlBuilder.toString());
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: " + e.getMessage());
        }
    }

    public static List<NoteData> generateNoteData(int count) {
        List<NoteData> noteDataList = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String title = "Блокнот #" + (i + 3);
            noteDataList.add(new NoteData(title));
        }
        return noteDataList;
    }
}
