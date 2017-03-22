public class ArrayUtils
{
	public static int minValue(int [] list)
	throws BadArrayException
	{
		if(list == null)
			{
				throw new BadArrayException("Array is null");
			}
		if(list.length == 0)
			{
				throw new BadArrayException("Array is empty");
			}
                
		int minValue = list[0];
		for(int n = 0; n < list.length; ++n)  
	    {
			 if(list[n] < minValue)
			{
				minValue = list[n];
			}
	    }
		return minValue;
	}
	
public static int[] copyRange(int [] list, int startIndex)
	throws BadArrayException
	{
		
		if(list == null)
		{
			throw new BadArrayException("Array is null");
		}
		if(startIndex < 0 || startIndex > list.length)
		{
			throw new ArrayIndexOutOfBoundsException(startIndex);
		}
		
		int[] newList = new int[list.length - startIndex];  


			for(int n = 0; n < newList.length; ++n) 
			{
				newList[n] = list[startIndex++];
	    	}
		
		
		return newList;
	}
	
	public static int indexOf(int[] list, int searchValue)
	throws BadArrayException
	{
		if(list == null)
		{
			throw new BadArrayException("Array is null");
		}

		for(int n = 0; n < list.length; ++n)  
	    {
			if(list[n] == searchValue)
			{
			    return n;
			}
	    }
		
		return -1;
	}
	
public static int lastIndexOf(int[] list, int searchValue)
	throws BadArrayException
	{
		if(list == null)
		{
			throw new BadArrayException("Array is null");

		}

		for(int n = list.length; --n >= 0;) 


	    {
			if(list[n] == searchValue)
			{
			   return  n;
			}
	    }
		
		return -1;
	}
}