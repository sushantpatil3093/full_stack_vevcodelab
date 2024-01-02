package ele.billing;


public class DemosticElectric1_Bill_Impl implements ElectricTariff,GST {

		int totalCharge;
		public int getBill(int noUnits) {
			if(noUnits>=0 && noUnits<=50) {
				totalCharge = MIN_CHGS + Z_0_50(noUnits); 
			}
			else if(noUnits>50 && noUnits<=100) {
				totalCharge = MIN_CHGS + Z_50_100(noUnits);
			}
			else if(noUnits>100) {
				totalCharge = MIN_CHGS + Z_100_above(noUnits);
			}
			return totalCharge;
			}
//		void display(int consId,String consName) {
//			System.out.println("Consumer Id : " + consId);
//			System.out.println("Consumer Name : " + consName);
//		}
		int Z_0_50(int noUnits) {
				int cal = 0;
				cal +=cal+ noUnits*Z_50_UC;
			return cal;	
		}
		int Z_50_100(int noUnits) {
			int cal1 = 0;
			cal1 += Z_0_50(50);//37.5
			int temp=noUnits-50;//75-50
			cal1 += temp*F51_100_UC;
			return cal1;
		}
		int Z_100_above(int noUnits) {
			int cal2 = 0;
			cal2 += Z_50_100(100);
			int temp=noUnits-100;
			cal2 += temp*GT_100_UC;
			return cal2;
		}


		public int cal_gst(int bill) {
			return (bill*gst_rate)/100;
		}
		}


