package FundamentalTasks;

/**
 * Created By Vito, 29.12.17, 08:30
 */
public class StringUtils {
    //my result
//    public static String toAlternativeString(String string) {
//
//        StringBuilder sb = new StringBuilder(string);
//
//        for (int index = 0;index<sb.length();index++){
//            char c = sb.charAt(index);
//            if (Character.isLowerCase(c)){
//                sb.setCharAt(index,Character.toUpperCase(c));
//            }
//            else {
//                sb.setCharAt(index, Character.toLowerCase(c));
//            }
//        }
//        String result = String.valueOf(sb);
//        return result;
//    }

    //CodeWars result
    public static String toAlternativeString(String string){
        String result = "";
        for (char c:string.toCharArray()){
            if (Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            }
            else {
                result += Character.toLowerCase(c);
            }
        }
        return result;
    }


}
