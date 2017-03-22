public class MyTime

{

    private int Hour;      // 0 - 23

    private int Minute;    // 0 - 59

    private int Second;    // 0 - 59

    /**

     * @param hour      the hour (0 to 23).

     * @param minute    the minute (0 to 59).

     * @param second    the second (0 to 59).

     */

    public void setTime(int hour, int minute, int second)

    {

    

    if ((hour < 0 || hour > 23) || (minute < 0 || minute > 59) || (second < 0 || second > 59))

    {

    this.Hour = 0; 

    this.Minute = 0;

    this.Second = 0;

    }

    else

    {

    this.Hour = hour;

    this.Minute = minute;

    this.Second = second;

    }

    }

    /**

     * @return the hour value of this object as an int.

     */

    public int getHour()

    {

        return this.Hour;

    }

    /**

     * @return the minute value of this object as an int.

     */

    public int getMinute()

    {

        return this.Minute;

    }

    /**

     * @return  the second value of this object as an int.

     */

    public int getSecond()

    {

        return this.Second;

    }

    /**


     * @param  other    the object to be compared.

     * @returns  true if both objects represent the same time value,

     *           false otherwise.

     */

    public boolean equals(MyTime other)

    {

    

    if ((this.getHour() == other.getHour()) && (this.getMinute() == other.getMinute()) 

    && (this.getSecond() == other.getSecond()))

{

    return true;

}

    else

    {

            return false;

    }

    }

    /**


     * @return the time value represented by this object as a String

     *         formatted as HH:MM:SS AM/PM .

     */

    public String toString()

    {

    

    

    if (this.Hour == 0)

    {

    return this.twoDigits(this.Hour + 12) + ":" + this.twoDigits(this.Minute) + ":" + this.twoDigits(this.Second) + " AM";

    }

    else if (this.Hour < 12 && Hour <= 23)

    {

    return this.twoDigits(this.Hour) + ":" + this.twoDigits(this.Minute) + ":" + this.twoDigits(this.Second) + " AM";

    }

    else if (this.Hour == 12)

    {

    return this.twoDigits(this.Hour) + ":" + this.twoDigits(this.Minute) + ":" + this.twoDigits(this.Second) + " PM";

    }

    else

    {

    return this.twoDigits(this.Hour - 12) + ":" + this.twoDigits(this.Minute) + ":" + this.twoDigits(this.Second) + " PM";

    }

    

    }

    /**

     * @return the time value represented by this object as a String

     *         formatted as HH:MM:SS universal time.

     */

    public String toUniversalString()

    {

        String result = this.twoDigits(this.Hour) + ":" + this.twoDigits(this.Minute) + ":" + this.twoDigits(this.Second);

        return result;

    }

    /**

     * @return the parameter 'value' formatted as a two digit String

     *         (with leading zero if needed).

     */

    private String twoDigits(int value)

    {

        Integer.toString(value);

        if (value < 10)

        {

        return "0" + Integer.toString(value);

        }

        else

        {

        return Integer.toString(value);

        }

    }

}
