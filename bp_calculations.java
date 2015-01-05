import java.util.*;

public class bp_calculations {
	
	public static void Adjust_Messages(double[][][] rho, double[] omega, int[] fxdRegs, double[] fxdVals)
	{
		double eps = Double.MIN_VALUE;
		//List<Double> omegaList = Arrays.asList(omega);
		for(int i = 0; i < fxdRegs.length; i++)
		{
			for(int j = 0; j < rho[0].length; j++)
				for(int k = 0; k < rho[0][0].length; k++)
					if(omega[j] == fxdVals[i])
						rho[i][j][k] = 1;
					else
						rho[i][j][k] = eps;
		}
	}
	
	public static int assign_parvalue(double[] probDist, double MCProb)
	{
		double cumSum = 0;
		int index = 0;
		while(MCProb > cumSum)
		{
			cumSum += probDist[index];
			index += 1;
		}
		return index;
	}
}
