package ele.billing;

public class MainBill {
	public static void main(String []args) {
		
	ElectricTariff a = new DemosticElectric1_Bill_Impl();
	GST b = new DemosticElectric1_Bill_Impl();
	int temp = a.getBill(500);
	System.out.println("Total bill with GST : "+(b.cal_gst(temp)+temp));
}
}

