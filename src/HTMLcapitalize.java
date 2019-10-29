public class HTMLcapitalize {

    private String html =
            "<html> \n" +
                    "<head> \n" +
                    "<TITLE>To jest tytul</Title> \n" +
                    "</head> \n" +
                    "<body> \n" +
                    "<b>Cos tam</b> \n" +
                    "</body> \n" +
                    "</html> ";

    private static String htmlCapital(String htmlCode) {
        char[] htmlParts = htmlCode.toCharArray();
        boolean capitalize = false;


        for (int i = 0; i < htmlParts.length; i++) {
            if (htmlParts[i] == '<') {
                capitalize = true;
            }else if(htmlParts[i] == '>') {
                capitalize = false;
            }else if (capitalize) {
                htmlParts[i] = Character.toUpperCase(htmlParts[i]);
            }
        }
        return new String(htmlParts);
    }

    public static void main(String[] args) {

        String html =
                "<html> \n" +
                        "<head> \n" +
                        "<TITLE>To jest tytul</Title> \n" +
                        "</head> \n" +
                        "<body> \n" +
                        "<b>Cos tam</b> \n" +
                        "</body> \n" +
                        "</html> ";

        System.out.println(htmlCapital(html));
    }
}
