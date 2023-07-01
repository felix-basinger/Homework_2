public class Homework2 {
    public static void main(String[] args) {

        // =============================== Задание 1 ==========================================

        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        str = str.replaceAll("[,{}\"]", "");
        str = str.replace(":", " ");
        String[] subStr;
        subStr = str.split(" ");
        for (int i = 0; i < subStr.length; i++) {
            if (subStr[i].contains("null")) {
                subStr[i - 1] = null;
                subStr[i] = null;

            }
        }

        for (int i = 0; i < subStr.length; i += 2) {
            if (subStr[i] != null) {
                String s = String.format("%s = '%s' and ", subStr[i], subStr[i + 1]);
                if (subStr[i + 2] == null) {
                    String stroke = String.format("%s = '%s'", subStr[i], subStr[i + 1]);
                    System.out.println(stroke);
                } else {
                    System.out.print(s);
                }
            }
        }

        //  =============================== Задание 2 =========================================

        System.out.println();
        String students =   "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                            "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";

        students = students.replaceAll("[{}\"]", "");
        students = students.replaceAll("[,:]", " ");
        String[] stud;
        stud = students.split(" ");

        for (int i = 0; i < stud.length; i += 6) {
            String new_s = String.format("Студент %s получил %s по предмету %s.", stud[i + 1], stud[i + 3], stud[i + 5]);
            System.out.println(new_s);
        }
    }
}
