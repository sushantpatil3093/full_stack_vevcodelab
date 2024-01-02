package ele.billing;

public interface ElectricTariff {
	
	//constants
		float Z_50_UC=0.75f;
		float F51_100_UC=1.2f;
		float GT_100_UC=1.8f;
		int MIN_CHGS=100;
		int getBill(int noUnits);
	}


