public class MyUrl {

private String mURL;

public MyUrl(String url) {

if (url.startsWith("http://"))

this.mURL = url;

else

this.mURL = ("http://" + url);

}

public void addArgument(String name, String value) {

if (mURL.contains("?"))

this.mURL = (mURL + "&" + urlEncode(name) + "=" + urlEncode(value));

else

this.mURL = (mURL + "?" + urlEncode(name) + "=" + urlEncode(value));

}

public void addArgument (String name, int ivalue) {

if (mURL.contains("?"))

this.mURL = (mURL + "&" + urlEncode(name) + "=" + Integer.toString(ivalue));

else

this.mURL = (mURL + "?" + urlEncode(name) + "=" + Integer.toString(ivalue));

}

public void addArgument(String name, double dvalue){

if (mURL.contains("?"))

this.mURL = (mURL + "&" + urlEncode(name) + "=" + Double.toString(dvalue));

else

this.mURL = (mURL + "?" + urlEncode(name) + "=" + Double.toString(dvalue));

}

public String toString() {

return this.mURL;

}

public static String urlEncode(String text) {

        int lengthURL = text.length();

        int current; 

        char position; 

        String alphanumeric = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-_.*");

        String Line = new String();

        for (current = 0; current < lengthURL; current++)

            {

            position = text.charAt(current);    

            if (alphanumeric.indexOf(position) != -1) 
                {

                Line += position;

                }

            else if (position == ' ')

                {

                Line += "+";

                }

            else               

                {

                String hexValue = Integer.toHexString(position);    

                Line += '%' + hexValue;

                }

            } 

        return Line;

}

}
