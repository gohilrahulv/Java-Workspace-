 
import java.util.ArrayList;
import java.util.List;

public class Ex19InterleavingString 
{
    public static List<String> findInterleavings(String str1, String str2) 
    {
        List<String> result = new ArrayList<>();
        findInterleavingsHelper(str1, str2, "", result);
        return result;
    }

    private static void findInterleavingsHelper(String str1, String str2, String interleaved, List<String> result) 
    {
        if (str1.length() == 0 && str2.length() == 0) 
        {

            result.add(interleaved);
            return;
        }

        if (str1.length() > 0) 
        {
            findInterleavingsHelper(str1.substring(1), str2, interleaved + str1.charAt(0), result);
        }

        if (str2.length() > 0) 
        {
            findInterleavingsHelper(str1, str2.substring(1), interleaved + str2.charAt(0), result);
        }
    }

    public static void main(String[] args) 
    {
        String str1 = "X";
        String str2 = "Y";
        List<String> interleavings = findInterleavings(str1, str2);
        System.out.println(interleavings);
    }
}

