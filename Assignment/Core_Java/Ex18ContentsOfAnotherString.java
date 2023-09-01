public class Ex18ContentsOfAnotherString 
{
    public static void main(String args[])
    {
        String str1 = "Red is My Fav Color.";
        String srt2 = "Orange Is My Fav Color.";

        String start = "Red";

        boolean startstr1 = str1.startsWith(start);
        boolean startsrt2 = srt2.startsWith(start);

        System.out.println(str1+"\n"+"Start with "+start+"?"+"\n"+startstr1);
        //Output Is True.........
        System.out.println("========================================");
        System.out.println(srt2+"\n"+"Start With "+start+"?"+"\n"+startsrt2);
        //OutPut Is False........
    }
}