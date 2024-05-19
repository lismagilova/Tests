package dir;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Settings {
    public static String file = "Settings.xml";

    private static String baseURL;
    private static String username;
    private static String password;
    private static Document document;

    static {
        try {
            File xmlFile = new File(file);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            document = dBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Problem: settings file not found: " + file);
        }
    }

    public static String getBaseURL() {
        if (baseURL == null) {
            NodeList nodeList = document.getElementsByTagName("BaseUrl");
            Node node = nodeList.item(0);
            baseURL = node.getTextContent();
        }
        return baseURL;
    }

    public static String getUsername() {
        if (username == null) {
            NodeList nodeList = document.getElementsByTagName("Username");
            Node node = nodeList.item(0);
            username = node.getTextContent();
        }
        return username;
    }

    public static String getPassword() {
        if (password == null) {
            NodeList nodeList = document.getElementsByTagName("Password");
            Node node = nodeList.item(0);
            password = node.getTextContent();
        }
        return password;
    }
}

