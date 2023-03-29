
public class parser {
    public static void main(String[] args){
        String a = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        StringBuilder sb = new StringBuilder();
        String[] b = a.split("\\,|\\{|\\}|\"|\\:");
        for (int i = 0; i < b.length; i++) {
            if (b[i].startsWith("фамилия")){
                sb.append("Студент"+" "+b[i+3]+" ");
            }
            if (b[i].startsWith("оценка")) {
                sb.append("получил"+" "+b[i+3]+" ");  
            }
            if (b[i].startsWith("предмет")){
                sb.append("по предмету"+" "+b[i+3]+"\n");
            }
        }
        System.out.println(sb);
    }
}


    
