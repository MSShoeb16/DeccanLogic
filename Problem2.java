import java.util.regex.Matcher;
import java.util.regex.Pattern;
  
class Problem2
{
    public static void main(String[] args)
    {
        String txt = "Cecilio Johnes Cordell Acott Curtice Bleue Dalis Menary Emanuele Barstock Emmy Bradane Gian Cossington Jamaal Danilevich Kerri Wilce Liuka Cowern Merrel Cornuau Marena Appleton Marlee Stobo Rochette Brew Rudyard Abbate Sharona Climo Shirlee Titcumb Taite Joriot Taite Huntriss Zach Simchenko";
 
        String regex1 = "c";
        Pattern pattern1 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(txt);
        while (matcher1.find())
        {
           
    }
}
