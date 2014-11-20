
public class Triangle {
	int sideA,sideB,sideC;
	public Triangle(int sideA, int sideB, int sideC) throws Exception
	{
		if(!this.isTriangle(sideA,sideB,sideC))
				return;
		
		else
		{
			this.sideA=sideA;
			this.sideB=sideB;
			this.sideC=sideC;
		}
	}

	public boolean isTriangle(int sideA2, int sideB2, int sideC2) {
		if((sideA+sideB)>sideC)
			return true;
		return false;
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