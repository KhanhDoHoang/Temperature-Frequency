import java.security.SecureRandom;

public class TemperatureFrequenc {
	
	private static final int TOTAL_NUMBERS = 100;
	private static final int NUMBER_OF_RANGES = 6;
	
	public static void main (String []args)
	{
		int[] frequencyOfTemp = new int[NUMBER_OF_RANGES];
		int[] temperatureData = new int[TOTAL_NUMBERS];
		int maxTemp = Integer.MAX_VALUE;
		int minTemp = Integer.MIN_VALUE;
		int sum = 0;
		double averageTemp = 0.0;
		
		SecureRandom randomGenerator = new SecureRandom();

		int count = 0;
		
		for(int i = 0; i < TOTAL_NUMBERS; i++)
		{
			
			
			//(max-min)-min
			//int currentTemp = (int)(Math.random() * (40 - (-40)) + (-40));//Math.random()*(40 - (-40)) + (-40)
			temperatureData[i] = randomGenerator.nextInt(40 + 40) - 40;			
			
				if(maxTemp == Integer.MAX_VALUE)
				{
					maxTemp = temperatureData[i];
				}else if(temperatureData[i] > maxTemp) {
					maxTemp = temperatureData[i];
				}
				
				if (minTemp == Integer.MIN_VALUE)
				{
					minTemp = temperatureData[i];
				}else if(temperatureData[i] < minTemp)
				{
					minTemp = temperatureData[i];
				}
				
		}
	
		for(int temp = 0; temp < TOTAL_NUMBERS; temp++)
		{
			int val = temperatureData[temp];
			if(val<-10)
			{
				frequencyOfTemp[0] += 1;
			}
			else if(val >=-10  && val <= 0 )
			{
				frequencyOfTemp[1] += 1;
			}
			else if(val > 0 && val <= 10)
			{
				frequencyOfTemp[2] += 1;
			}
			else if(val > 10 && val <= 20)
			{
				frequencyOfTemp[3] += 1;
			}
			else if(val> 20 && val <= 30)
			{
				frequencyOfTemp[4] += 1;
			}
			else
			{
				frequencyOfTemp[5] += 1;
			}	
			
			sum += val;
			count++;
		}
		
		averageTemp = sum / count;
		
		System.out.println("Maximum temperature: " + maxTemp);
		System.out.println("Minimum temperature: " + minTemp);
		System.out.println("Average temperature: " + averageTemp + " \n");
		System.out.println("Frequency of Temperature range: ");
		
		
		print("Less than -10 ", frequencyOfTemp[0]);
		System.out.println("");
		print("-10 to 0 ", frequencyOfTemp[1]);
		System.out.println("");
		print("0 to 10 ", frequencyOfTemp[2]);
		System.out.println("");
		print("10 to 20 ", frequencyOfTemp[3]);
		System.out.println("");
		print("20 to 30 ", frequencyOfTemp[4]);
		System.out.println("");
		print("30 to 40 ", frequencyOfTemp[5]);
	}
		
		
	//String to print out the method 
	//integer controls the iteration of a repetition structure
	//Invoke it when printing out the histogram of stars
	private static void print(String message, int repetition)
	{
		System.out.print(message);	
		for (int i = 0; i <= repetition; i++)
		{
			System.out.print("*");
		}

	}
	
}


