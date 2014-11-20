
public class Triangle {
	int sideA,sideB,sideC;
	public Triangle(int sideA, int sideB, int sideC) throws Exception
	{
		if((sideA+sideB)<sideC)
		{
			throw new Exception("Not a triangle");
		}
		else
		{
			this.sideA=sideA;
			this.sideB=sideB;
			this.sideC=sideC;
		}
	}
	public boolean isEquilatTriangle()
	{
		if((sideA==sideB)&&(sideB==sideC))
			return true;
		return false;
		
	}
	public boolean isIsocelesTriangle()
	{
		if((sideA==sideB)||(sideB==sideC)||(sideA==sideC))
			return true;
		return false;
	}
	public boolean isScaleneTriangle()
	{
		if((sideA!=sideB)&&(sideB!=sideC)&&(sideA!=sideC))
			return true;
		return false;
	}
}