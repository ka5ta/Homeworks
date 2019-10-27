public class CamelCaseReverse {

    public String findCapitalLetter(String text) {

        StringBuilder sb = new StringBuilder();
        sb.append(text.charAt(0));
        boolean startOfLine = false;

        for (int i = 1; i < text.length(); i++) {
            char checkedLetter = text.charAt(i);
            /*if(checkedLetter=='\n') {
                startOfLine = true;
            } else if(startOfLine){
                startOfLine = false;
            } else if(Character.isUpperCase(checkedLetter)){
                sb.append(" ");
            }
                sb.append(checkedLetter);*/

            // newline
            if(checkedLetter=='\n') {
                startOfLine = true;
                sb.append(checkedLetter);
                continue;
            }

            // uppercase
            if(Character.isUpperCase(checkedLetter)){
                if(startOfLine) {
                    startOfLine = false;
                } else {
                    sb.append(" ");
                }
                sb.append(checkedLetter);
                continue;
            }

            // else
            sb.append(checkedLetter);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "DzisiajJestCzwartek\nAJutroBedziePiatek";
        CamelCaseReverse cc = new CamelCaseReverse();
        System.out.println(cc.findCapitalLetter(text));
    }
}
